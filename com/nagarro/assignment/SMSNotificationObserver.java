package com.nagarro.assignment;

public class SMSNotificationObserver implements NotificationObserver{

    @Override
    public void update(String subject, String message) {
        
        System.out.println("SMS Observer: Received notification - Subject: " + subject + ", Message: " + message);
    }
}
