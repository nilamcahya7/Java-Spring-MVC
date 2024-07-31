package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.DivisionService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("employee")
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  @Autowired
  private DivisionService divisionService;

  @GetMapping
  public String index(Model model) {
    List<Employee> employees = employeeService.get();
    model.addAttribute("employees", employees);
    return "employee/index";
  }

  @GetMapping("form")
  public String form(Model model) {
    model.addAttribute("employee", new Employee());
    model.addAttribute("divisions", divisionService.get());
    return "employee/form";
  }

  @PostMapping("save")
  public String save(Employee employee) {
    return employeeService.save(employee) ? "redirect:/employee" : "employee/form";
  }

  @GetMapping("update/{id}")
  public String edit(@PathVariable Integer id, Model model) {
    Employee employee = employeeService.get(id);
    model.addAttribute("employee", employee);
    model.addAttribute("divisions", divisionService.get());
    return "employee/editForm";
  }

  @PostMapping("update")
  public String update(Employee employee) {
    return employeeService.save(employee) ? "redirect:/employee" : "employee/editForm";
  }

  @GetMapping("delete/{id}")
  public String delete(@PathVariable Integer id) {
      return employeeService.delete(id) ? "redirect:/employee" : "employee/form";
  }
  
}
