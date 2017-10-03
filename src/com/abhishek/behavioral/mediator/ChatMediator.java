package com.abhishek.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

class ChatMediatorImpl implements ChatMediator {
    private List<User> listUsers;

    @Override
    public void sendMessage(String message, User user) {
        for(User u : this.listUsers){
            //message should not be received by the user sending it
            if(u != user){
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        if(listUsers == null) {
            listUsers = new ArrayList<>();
        }

        listUsers.add(user);
    }
}

