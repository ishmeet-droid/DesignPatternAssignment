package com.nagarro.assignment;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private static NotificationService instance;

    private List<NotificationSubscriber> subscribers;

    private List<NotificationObserver> observers;

    public NotificationService() {

        subscribers = new ArrayList<>();
        observers = new ArrayList<>();
    }

    //Double Check Method for Singleton object creation
    public static NotificationService getInstance(){
    
        if(instance == null){
            synchronized(NotificationService.class) {
                if(instance == null)
                    instance = new NotificationService();
            }
        }
        return instance;
    }

    public void addSubscriber(NotificationSubscriber subscriber){
        subscribers.add(subscriber);
    }

    public void addObservers(NotificationObserver observer){
        observers.add(observer);
    }
    
    public void sendNotification(String subject, String message){

        for( NotificationSubscriber subscriber: subscribers){
            String channel = subscriber.getChannel();
            NotificationStrategy strategy = getStrategy(channel);
            strategy.sendNotification(subject, message);
        }

        for (NotificationObserver observer: observers){

            observer.update(subject,message);
        }
    }

    private NotificationStrategy getStrategy(String channel) {
       
        switch(channel){
         
            case "Email": 
             return new EmailNotificationStrategy();

            case "SMS":
                return new SMSNotificationStrategy();

            default:
            throw new IllegalArgumentException("Inavalid Notification channel" + channel);


        }
    }
    
    
}
