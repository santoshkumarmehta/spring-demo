package org.example;

import org.example.notifications.EmailService;
import org.example.notifications.NotificationInterface;
import org.example.notifications.PopulateNotificationService;
import org.example.notifications.SMSService;

public class Main {
    public static void main(String[] args) {

        NotificationInterface notificationInterface = new PopulateNotificationService();
        OrderService orderService = new OrderService();
        orderService.setNotificationInterface(notificationInterface);
        orderService.placeOrder();
    }
}