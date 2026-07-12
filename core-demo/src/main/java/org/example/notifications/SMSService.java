package org.example.notifications;

public class SMSService implements NotificationInterface{
    @Override
    public void sendNotification() {
        System.out.println("SMS sent");
    }
}
