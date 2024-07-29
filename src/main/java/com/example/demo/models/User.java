package com.example.demo.models;

public class User{
  private Integer id;
  private Integer employeeId;
  private String username;
  private String password;

  public User(Integer id, Integer employeeId, String username, String password) {
    this.id = id;
    this.employeeId = employeeId;
    this.username = username;
    this.password = password;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  
}
