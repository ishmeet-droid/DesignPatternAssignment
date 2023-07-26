package com.nagarro.assignment;

public class Application {

    public static void main(String[] args) {

        // Mocked subscribers

        NotificationSubscriber subscriber1 = new User(
                "Man", "Email");

        NotificationSubscriber subscriber2 = new User("Ish","SMS");

        NotificationService notificationService = NotificationService.getInstance();

        notificationService.addSubscriber(subscriber1);
        notificationService.addSubscriber(subscriber2);

        //Create observer instance..

        NotificationObserver emailObserver = new EmailNotificationObserver();
        NotificationObserver smsObserver = new SMSNotificationObserver();
        
        notificationService.addObservers(emailObserver);

        notificationService.addObservers(smsObserver);

        //Send notifications

        notificationService.sendNotification("Important update", "Task Completed");
    }
}
