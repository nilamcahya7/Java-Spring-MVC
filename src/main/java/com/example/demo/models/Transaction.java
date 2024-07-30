package com.example.demo.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_tr_transaction")
public class Transaction {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer id;
  
  @Column(name = "begin_reservation")
  private LocalDateTime beginReservation;

  @Column(name = "end_reservation")
  private LocalDateTime endReservation;

  @Column(name = "submit_transaction")
  private LocalDateTime submitTransaction;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "room_id", referencedColumnName = "id")
  private Room room;

  @ManyToOne
  @JoinColumn(name = "status_id", referencedColumnName = "id")
  private Status status;

  public Transaction(){

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDateTime getBeginReservation() {
    return beginReservation;
  }

  public void setBeginReservation(LocalDateTime beginReservation) {
    this.beginReservation = beginReservation;
  }

  public LocalDateTime getEndReservation() {
    return endReservation;
  }

  public void setEndReservation(LocalDateTime endReservation) {
    this.endReservation = endReservation;
  }

  public LocalDateTime getSubmitTransaction() {
    return submitTransaction;
  }

  public void setSubmitTransaction(LocalDateTime submitTransaction) {
    this.submitTransaction = submitTransaction;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Room getRoom() {
    return room;
  }

  public void setRoom(Room room) {
    this.room = room;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }
}
