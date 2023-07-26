package com.nagarro.assignment;

public class SMSNotificationStrategy implements NotificationStrategy {

    @Override
    public void sendNotification(String subject, String message) {
       
        NotificationSender.sendNotification("SMS", subject, message);
    }
    
}
