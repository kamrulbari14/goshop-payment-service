package com.kamrul.goshop.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment-provider")
public class PaymentController {

  @GetMapping("/pay-now/{price}")
  public String payNow(@PathVariable("price") double price) {
    return "Payment with " + price + " is successful!";
  }
}
