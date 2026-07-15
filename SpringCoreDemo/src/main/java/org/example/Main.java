package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        PaymentService paymentService = new PaymentService();
//
//        OrderService orderService = new OrderService();
//        orderService.setPaymentService(paymentService);
//        orderService.processOrder();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        PaymentService paymentService = context.getBean(PaymentService.class);
//        paymentService.processPayment();
        OrderService orderService = context.getBean(OrderService.class);
        orderService.processOrder();

        UserService userService = context.getBean(UserService.class);
        userService.saveUser();
        System.out.println(userService.getName());

        Student student = context.getBean(Student.class);
        student.saveStudent();
        System.out.println(student.getName());

    }
}