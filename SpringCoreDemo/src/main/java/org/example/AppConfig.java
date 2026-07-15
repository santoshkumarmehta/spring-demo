package org.example;

import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.example.payment.UPIPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class AppConfig {


    @Bean
    public UserService userService() {
        return new UserService("santosh", 30);
    }

    @Bean
//    @Primary
    @Qualifier("upi")
    public PaymentService createUpiPayment() {
        return new UPIPayment();
    }
    
    @Bean
    @Qualifier("cp")
    public PaymentService createCardPayment() {
        return new CardPayment();
    }

    @Bean
    public OrderService createOrderService( @Qualifier("upi") PaymentService paymentService) {
        return new OrderService(paymentService);
    }

    @Bean
    public Student createStudent() {
        return new Student(1, "santosh", 10000);
    }
}
