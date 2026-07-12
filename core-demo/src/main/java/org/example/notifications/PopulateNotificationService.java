package org.example.notifications;

public class PopulateNotificationService implements NotificationInterface{
    @Override
    public void sendNotification() {
        System.out.println("Populate notification");
    }
}
