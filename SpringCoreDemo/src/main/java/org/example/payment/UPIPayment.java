package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
//@Qualifier("upi")
public class UPIPayment implements PaymentService{
    @Override
    public void processPayment() {
        System.out.println("UPI Payment processed");
    }
}
