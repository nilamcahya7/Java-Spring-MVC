package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.User;
import com.example.demo.models.Room;
import com.example.demo.models.Status;
import com.example.demo.models.Transaction;
import com.example.demo.service.RoomService;
import com.example.demo.service.StatusService;
import com.example.demo.service.TransactionService;
import com.example.demo.service.UserService;

@SpringBootTest
class TransactionApplicationTest {
  @Autowired
  private TransactionService transactionService;

  @Autowired
  private UserService userService;

  @Autowired
  private RoomService roomService;

  @Autowired
  private StatusService statusService;

  @Test
  void post(){
    Integer userId = 1;
    User user = userService.get(userId);

    Integer roomId = 1;
    Room room = roomService.get(roomId);

    Integer statusId = 1;
    Status status = statusService.get(statusId);

    Transaction transaction = new Transaction();
    transaction.setRoom(room);
    transaction.setStatus(status);
    transaction.setUser(user);
    transaction.setBeginReservation(null);
    transaction.setEndReservation(null);
    transaction.setSubmitTransaction(null);


    Boolean result = transactionService.save(transaction);
    assertEquals(true, result);
  }

  @Test
	void delete(){
		Integer id = 60;
		Boolean result = transactionService.delete(id);
		assertEquals(true, result);
	}

	@Test
  void getById(){
    Integer id = 4;
    Transaction result = transactionService.get(id);
    assertEquals(id, result.getId());
  }

  @Test 
  void get(){
    List<Transaction> transactions = transactionService.get();

    for (Transaction transaction : transactions) {
      System.out.println("Transaction Id: " + transaction.getId() + ", User ID: " + transaction.getUser() + ", Room ID: " + transaction.getRoom() + ", Status ID: " + transaction.getStatus() + ", Begin Reservation: " + transaction.getBeginReservation() + ", End Reservation: " + transaction.getEndReservation());
    }
  }
}
