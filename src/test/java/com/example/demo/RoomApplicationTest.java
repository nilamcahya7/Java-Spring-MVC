package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.Room;
import com.example.demo.service.RoomService;

@SpringBootTest
class RoomApplicationTest {
  @Autowired
  private RoomService roomService;

  @Test
  void post(){
    Room room = new Room();
    room.setName("Pantry");
    room.setCapacity(20);
    Boolean result = roomService.save(room);
    assertEquals(true, result);
  }

  @Test
  void delete(){
    Integer id = 5;
    Boolean result = roomService.delete(id);
    assertEquals(true, result);
  }

  @Test
  void getById(){
    Integer id = 4;
    Room result = roomService.get(id);
    assertEquals(id, result.getId());
  }

  @Test 
  void get(){
    List<Room> rooms = roomService.get();

    for (Room room : rooms) {
      System.out.println("Room ID: " + room.getId() + ", Name: " + room.getName() + ", Capacity: " + room.getCapacity());
    }
  }
}
