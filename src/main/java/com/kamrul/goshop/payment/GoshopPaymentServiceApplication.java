package com.kamrul.goshop.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GoshopPaymentServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(GoshopPaymentServiceApplication.class, args);
  }

}
