package com.module.backend.admin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class BackendController {
  @GetMapping("")
  public String Homepage() {
    return "index";
  }
}
