package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NotificationServiceTestSuite {
    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceivedNotification() {
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        notificationService.addSubscriber(client);
        notificationService.sendNotification(notification);
        Mockito.verify(client).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(secondClient);
        notificationService.addSubscriber(thirdClient);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        notificationService.addSubscriber(client);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}

    //////////////  OR  //////////////////
    /*
    private void addSubscribers(Client... clients) {
        for(Client currentClient : clients) {
            notificationService.addSubscriber(currentClient);
        }
    }
     + invocation in notificationShouldBeSentToAllSubscribedClients test:
    addSubscribers(client, secondClient, thirdClient);
*/
