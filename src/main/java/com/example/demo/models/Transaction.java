package com.example.demo.models;

import java.time.LocalDateTime;

public class Transaction {
  private Integer id;
  private Integer userId;
  private Integer roomId;
  private Integer statusId;
  private LocalDateTime beginReservation;
  private LocalDateTime endReservation;
  private LocalDateTime submitTransaction;

  public Transaction(){

  }

  public Transaction(Integer id, Integer userId, Integer roomId, Integer statusId, LocalDateTime beginReservation,
      LocalDateTime endReservation, LocalDateTime submitTransaction) {
    this.id = id;
    this.userId = userId;
    this.roomId = roomId;
    this.statusId = statusId;
    this.beginReservation = beginReservation;
    this.endReservation = endReservation;
    this.submitTransaction = submitTransaction;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public Integer getStatusId() {
    return statusId;
  }

  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
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

  
}
