package com.abhishek.behavioral.mediator;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    abstract void sendMessage(String message);
    abstract void receiveMessage(String message);
}

class UserImpl extends User {

    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Sending message "+ message+" from user "+name);
        chatMediator.sendMessage(message, this);
    }

    @Override
    void receiveMessage(String message) {
        System.out.println("Receiving message "+ message+" by user "+name);
    }
}
