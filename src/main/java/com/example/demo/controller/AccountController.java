package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("account")
public class AccountController {
  @Autowired
  private UserService userService;

  @GetMapping
  public String forgotPassword(Model model) {
    return "account/forgotPassword";
  }

  @GetMapping("find-username")
  public String formUsername(Model model) {
    return "account/formForgotPassword";
  }

  @PostMapping("forgot-password")
  public String processForgotPassword(String username, Model model) {
    User user = userService.findByUsername(username);
    if (user == null) {
      model.addAttribute("error", "Username not found");
      return "account/formForgotPassword";
    }

    model.addAttribute("username", username);
    return "account/resetPassword";
  }

  @PostMapping("reset-password")
  public String processResetPassword(String username, String password, Model model) {
    User user = userService.findByUsername(username);
    if (user == null) {
      model.addAttribute("error", "Invalid username.");
      return "account/resetPassword";
    }

    user.setPassword(password);
    userService.save(user);

    return "account/forgotPassword";
  }
}
