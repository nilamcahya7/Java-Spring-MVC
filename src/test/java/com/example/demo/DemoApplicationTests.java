package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.Division;
import com.example.demo.service.DivisionService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private DivisionService divisionService;

	@Test
	void post() {
		Division division = new Division();
		division.setName("Marketing");
		Boolean result = divisionService.save(division);
		assertEquals(true, result);
	}

	@Test
	void delete(){
		Integer id = 1;
		Boolean result = divisionService.delete(id);
		assertEquals(true, result);
	}

	@Test
  void getById(){
    Integer id = 2;
    Division result = divisionService.get(id);
    assertEquals(id, result.getId());
  }

  @Test 
  void get(){
    List<Division> divisions = divisionService.get();

    for (Division division : divisions) {
      System.out.println("Division ID: " + division.getId() + ", Name: " + division.getName());
    }
  }

}
