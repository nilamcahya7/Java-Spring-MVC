package com.example.demo.models;

public class User extends Employee{
  private String username;
  private String password;
  private Integer employeeId;


  public User(String username, String password, Integer employeeId) {
    this.username = username;
    this.password = password;
    this.employeeId = employeeId;
  }
  public User(String firstName, String lastName, String email, Integer divisionId, String username, String password,
    Integer employeeId) {
    super(firstName, lastName, email, divisionId);
    this.username = username;
    this.password = password;
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

  public Integer getEmployeeId() {
    return employeeId;
  }
  
  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }
}
