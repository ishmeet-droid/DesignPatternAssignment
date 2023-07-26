package com.nagarro.assignment;

public class EmailNotificationObserver implements NotificationObserver {

    @Override
    public void update(String subject, String message) {
      System.out.println("Email Observer: Received notification - Subject: " + subject + ", Message: " + message);
    }
    
}
