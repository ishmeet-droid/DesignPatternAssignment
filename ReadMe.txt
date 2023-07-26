
Design Pattern used Explaination

Working Of Interfaces and classes build:--

Notification : An Interface representing the notification to be sent.

EmailNotification and SMSNotification: Concrete class implementing the 'Notification' interface for Email and SMS Notifications, respectively.

NotificationFactory: A factory class responsible for creating appropriate notification objects based on the channel type.

NotificationSender: A facade class that act as a simplified interface to the notification system, hiding the complexity of object creation and message sending.

NotificationSubscriber: An interface representing users who have subscribed to notifications.

User: A concrete class representing a user who subscribes to notifications.

NotificationStrategy: An interface for representing strategy Pattern, defining the strategy to send notifications.

EmailNotificationStrategy and SMSNotificationStrategy:
Concrete classes implementing the 'NotificationStrategy' interface for sending Email and SMS notifications, respectively.

NotificationObserver: An interface representing observers who want to be notified of sent notifications.

EmailNotificationObserver and SMSNotificationObserver:
Concrete classes implementing the 'NotificationObserver' interface for sending Email and SMS notification to subscribed User for that speific type only.

NotificationService: A singleton class that handles the notification process and keep track of subscribers and observers.
