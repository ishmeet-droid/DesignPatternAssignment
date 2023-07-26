package com.nagarro.assignment;

public class SMSNotification implements Notificaion {

    @Override
    public void send(String subject, String message) {

        System.out.println(
                "Sending SMS - Subject: " + subject + ", Message: " + message);
    }

}
