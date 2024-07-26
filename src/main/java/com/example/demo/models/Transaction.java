package com.example.demo.models;

import java.sql.Date;
import java.sql.Timestamp;

public class Transaction {
  private Integer id;
  private Integer userId;
  private Integer roomId;
  private Integer statusId;
  private Date beginReservation;
  private Date endReservation;
  private Timestamp submitTransaction;

  public Transaction(){

  }

  public Transaction(Integer id, Integer userId, Integer roomId, Integer statusId, Date beginReservation,
      Date endReservation, Timestamp submitTransaction) {
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

  public Date getBeginReservation() {
    return beginReservation;
  }

  public void setBeginReservation(Date beginReservation) {
    this.beginReservation = beginReservation;
  }

  public Date getEndReservation() {
    return endReservation;
  }

  public void setEndReservation(Date endReservation) {
    this.endReservation = endReservation;
  }

  public Timestamp getSubmitTransaction() {
    return submitTransaction;
  }

  public void setSubmitTransaction(Timestamp submitTransaction) {
    this.submitTransaction = submitTransaction;
  }

  
}
