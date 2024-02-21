package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;

import java.util.HashSet;
import java.util.Set;

public class NotificationService {
    private Set<Client> clients = new HashSet<>();
    public void addSubscriber(Client client){
        this.clients.add(client);
    }

    public void removeSubscriber(Client client){
        this.clients.remove(client);
    }
    public void sendNotification(Notification notification){
        this.clients.forEach(c -> c.receive(notification));
    }
}
