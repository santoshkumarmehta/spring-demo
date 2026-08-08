package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.example.OrderService;
@Component
public class PaymentService {

    @Autowired
    private OrderService orderService;

//    public PaymentService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public void processPayment(){

        System.out.println("Payment processed successfully");

//        orderService.getOrderDetails();
    }
}
