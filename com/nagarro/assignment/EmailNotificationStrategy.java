package com.nagarro.assignment;

public class EmailNotificationStrategy implements NotificationStrategy {

    @Override
    public void sendNotification(String subject, String message) {
      
        NotificationSender.sendNotification("Email", subject, message);
    }
    
}
