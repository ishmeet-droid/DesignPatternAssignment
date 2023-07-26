package com.nagarro.assignment;

public class User implements NotificationSubscriber {

    private String name;
    private String channel;

    
    public User(String name, String channel) {
        this.name = name;
        this.channel = channel;
    }


    @Override
    public String getChannel() {
       
     return channel;



    }
    
}
