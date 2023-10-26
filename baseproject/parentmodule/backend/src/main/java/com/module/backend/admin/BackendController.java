package com.module.backend.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BackendController {
  @GetMapping("")
  public String Homepage() {
    return "index";
  }
}
