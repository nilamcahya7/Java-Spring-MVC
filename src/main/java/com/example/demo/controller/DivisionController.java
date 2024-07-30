package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Division;
import com.example.demo.service.DivisionService;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("division") //boleh kasih atau enggak
public class DivisionController {
  @Autowired
  private DivisionService divisionService;

  //nampilin list mapping
  @GetMapping //localhost:8080/division
  public String index(Model model){ // Model dapat digunakan untuk maping, model bukan dari models tapi dari springboot
    List<Division> divisions = divisionService.get();
    model.addAttribute("divisions" , divisions); //regions harus bersifat atau menggambarkan data dalam kasus ini data bersifat jamak
    return "division/index"; //return ke halaman berupa path html atau url
  }

  @GetMapping("form")
  public String form(Model model) {
    model.addAttribute("division", new Division());
    return "division/form";
  }

  @PostMapping("save")
  public String save(Division division) {
      return divisionService.save(division) ? "redirect:/division" : "division/form";
  }
  
  @GetMapping("update/{id}")
  public String edit(@PathVariable Integer id, Model model) {
    Division division = divisionService.get(id);
    model.addAttribute("division", division);
    return "division/editForm";
  }
  
  @PostMapping("update")
  public String update(Division division) {
    return divisionService.save(division) ? "redirect:/division" : "division/editForm";
  }
  
  @GetMapping("delete/{id}")
  public String delete(@PathVariable Integer id) {
    return divisionService.delete(id) ? "redirect:/division" : "division/form";
}
  
}
