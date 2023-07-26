package com.nagarro.assignment;

public class NotificationFactory {
    

    public static Notificaion createNotificaion(String channel){

        switch(channel){
         
            case "Email": 
             return new EmailNotification();

            case "SMS":
                return new SMSNotification();

            default:
            throw new IllegalArgumentException("Inavalid Notification channel" + channel);


        }
    }
}
