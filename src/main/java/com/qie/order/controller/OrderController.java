package com.qie.order.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {


      @GetMapping("/call")
      public String getTestApi(){
          return "Order is called";
      }
}
