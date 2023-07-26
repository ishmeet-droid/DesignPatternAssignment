package com.nagarro.assignment;

public class EmailNotification implements Notificaion {

    @Override
    public void send(String subject, String message) {

        // Implementation for sending an email

        System.out.println(
                "Sending Email - Subject: " + subject + ", Message: " + message);

    }

}
