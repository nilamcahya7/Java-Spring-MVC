package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.Status;
import com.example.demo.service.StatusService;

@SpringBootTest
class StatusApplicationTest {
  @Autowired
  private StatusService statusService;

  @Test
  void post(){
    Status status = new Status();
    status.setName("Pending");
    Boolean result = statusService.save(status);
    assertEquals(true, result);
  }

  @Test
  void delete(){
    Integer id = 4;
    Boolean result = statusService.delete(id);
    assertEquals(true, result);
  }

  @Test
  void getById(){
    Integer id = 1;
    Status result = statusService.get(id);
    assertEquals(id, result.getId());
  }

  @Test 
  void get(){
    List<Status> statusName = statusService.get();

    for (Status status : statusName) {
      System.out.println("Room ID: " + status.getId() + ", Name: " + status.getName());
    }
  }
}
