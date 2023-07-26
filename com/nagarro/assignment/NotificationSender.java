package com.nagarro.assignment;

public class NotificationSender {
    

    public static void sendNotification(String channel, String subject, String message){

        Notificaion notificaion = NotificationFactory.createNotificaion(channel);

        notificaion.send(subject, message);
    }
}
