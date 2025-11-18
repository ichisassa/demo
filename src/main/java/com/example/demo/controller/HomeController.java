package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping({"/", "/hello"})
  public String hello(Model model) {
    model.addAttribute("title", "Welcome to Demo");
    model.addAttribute("message", "Thanks for visiting this sample app. Take your time and explore.");
    model.addAttribute("now",LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
    return "home";
  }
}
