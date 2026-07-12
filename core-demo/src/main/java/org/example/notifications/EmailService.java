package org.example.notifications;

public class EmailService implements NotificationInterface{

    public void sendEmail() {
     System.out.println("Email sent");
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent");
    }
}
