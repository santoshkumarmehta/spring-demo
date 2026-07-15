package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

    PaymentService paymentService;

    public OrderService( PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processOrder() {
        this.paymentService.processPayment();
        System.out.println("Order processed");
    }

//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
}
