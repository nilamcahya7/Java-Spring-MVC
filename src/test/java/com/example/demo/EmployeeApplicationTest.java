package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.Employee;
import com.example.demo.models.Division;
import com.example.demo.service.DivisionService;
import com.example.demo.service.EmployeeService;

@SpringBootTest
class EmployeeApplicationTest  {
  @Autowired
  private EmployeeService employeeService;

  @Autowired
  private DivisionService divisionService;

  @Test
	void post() {
		Integer divisionId = 1;
    Division division = divisionService.get(divisionId);

    Employee employee = new Employee();
    employee.setFirstName("Megaadwa1");
    employee.setLastName("Bel2wefwuga");
    employee.setEmail("mega@gmail.com");
    employee.setDivision(division);

    Boolean result = employeeService.save(employee);
    assertEquals(true, result);
  }

	@Test
	void delete(){
		Integer id = 16;
		Boolean result = employeeService.delete(id);
		assertEquals(true, result);
	}

	@Test
  void getById(){
    Integer id = 4;
    Employee result = employeeService.get(id);
    
    assertEquals(id, result.getId());
  }

  @Test 
  void get(){
    List<Employee> employees = employeeService.get();

    for (Employee employee : employees) {
      System.out.println("Employee Id: " + employee.getId() + ", Name: " + employee.getFirstName() + " " + employee.getFirstName() + ", Email: " + employee.getEmail() + ", Division: " + employee.getDivision());
    }
  }
}
