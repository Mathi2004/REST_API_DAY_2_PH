package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController_1 {
          @Value("${msg}")
          public String msg;
          @GetMapping("/message")
          public String message()
          {
        	  return msg;
          }
}
