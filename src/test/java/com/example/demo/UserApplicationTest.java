package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.Employee;
import com.example.demo.models.User;
import com.example.demo.service.UserService;
import com.example.demo.service.EmployeeService;

@SpringBootTest
class UserApplicationTest {
  @Autowired
  private UserService userService;

  @Autowired
  private EmployeeService employeeService;

  @Test
	void post() {
    Integer employeeId = 15;
    Employee employee = employeeService.get(employeeId);

    User user = new User();
    user.setUsername("ahay.ahay");
    user.setPassword("abcd");
    user.setEmployee(employee);

    Boolean result = userService.save(user);
    assertEquals(true, result);
  }

	@Test
	void delete(){
		Integer id = 14;
		Boolean result = userService.delete(id);
		assertEquals(true, result);
	}

	@Test
  void getById(){
    Integer id = 4;
    User result = userService.get(id);
    assertEquals(id, result.getId());
  }

  @Test 
  void get(){
    List<User> users = userService.get();

    for (User user : users) {
      System.out.println("User Id: " + user.getId() + ", Username: " + user.getUsername());
    }
  }
}
