package org.example;

import org.example.notifications.EmailService;
import org.example.notifications.NotificationInterface;

public class OrderService {

    NotificationInterface notificationInterface;

//    public OrderService(NotificationInterface notificationInterface) {
//
//        this.notificationInterface=notificationInterface;
//    }

    public void placeOrder() {
        System.out.println("Order placed");
        notificationInterface.sendNotification();
    }

    public void setNotificationInterface(NotificationInterface notificationInterface) {
        this.notificationInterface = notificationInterface;
    }
}
