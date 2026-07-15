package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("cp")
public class CardPayment implements PaymentService{
    @Override
    public void processPayment() {
        System.out.println("Card Payment processed");
    }
}
