package com.kodilla.mockito.homework2;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherServiceTestSuite {
   WeatherService service = new WeatherService();
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    Alert alert = Mockito.mock(Alert.class);
    Info info = Mockito.mock(Info.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNeitherAlertNorInfo() {
        //given (to init a map)
        service.addClientToLocation(client1,"Wroclaw");
        service.addClientToLocation(client1,"Warszawa");
        service.addClientToLocation(client1,"Krakow");
        //when
        service.sendAlert(alert,"Wroclaw");
        service.sendAlert(alert,"Warszawa");
        service.sendAlert(alert,"Krakow");
        service.sendInfo(info);
        //then
        Mockito.verify(client2, Mockito.never()).receive(alert);
        Mockito.verify(client2, Mockito.never()).receive(info);
    }

    @Test
    public void SubscribedClientShouldReceiveAlertAndInfo(){
        //given
        //when
        service.addClientToLocation(client1,"Wroclaw");
        service.sendAlert(alert,"Wroclaw");
        service.sendInfo(info);
        //then
        Mockito.verify(client1,Mockito.times(1)).receive(alert);
        Mockito.verify(client1,Mockito.times(1)).receive(info);
    }

    @Test
    public  void unsubscribedClientShouldNotReceiveAlertButShouldReceiveInfo(){
        //given
        //when
        service.addClientToLocation(client1,"Wroclaw");
        service.addClientToLocation(client1,"Warszawa");
        service.removeClientFromLocation(client1,"Wroclaw");
        service.sendAlert(alert,"Wroclaw");
        service.sendInfo(info);
        //then
        Mockito.verify(client1, Mockito.never()).receive(alert);
        Mockito.verify(client1,Mockito.times(1)).receive(info);
    }

    @Test
    public  void unsubscribedClientFromLastLocationShouldNotReceiveNeitherAlertNorInfo(){
        //given
        //when
        service.addClientToLocation(client1,"Wroclaw");
        service.addClientToLocation(client1,"Warszawa");
        service.removeClientFromLocation(client1,"Wroclaw");
        service.removeClientFromLocation(client1,"Warszawa");
        service.sendAlert(alert,"Wroclaw");
        service.sendAlert(alert,"Warszawa");
        service.sendInfo(info);
        //then
        Mockito.verify(client1, Mockito.never()).receive(alert);
        Mockito.verify(client1, Mockito.never()).receive(info);
    }

    @Test
    public  void removedClientFromServiceShouldNotReceiveNeitherAlertNorInfo(){
        //given
        //when
        service.addClientToLocation(client1,"Wroclaw");
        service.addClientToLocation(client1,"Warszawa");
        service.addClientToLocation(client1,"Krakow");
        service.removeClientFromService(client1);
        service.sendAlert(alert,"Wroclaw");
        service.sendAlert(alert,"Warszawa");
        service.sendAlert(alert,"Krakow");
        service.sendInfo(info);
        //then
        Mockito.verify(client1, Mockito.never()).receive(alert);
        Mockito.verify(client1, Mockito.never()).receive(info);
    }

    @Test
    public void SubscribedClientShouldReceiveEachInfoAndOnlySpecificAlert() {
        //given
        //when
        service.addClientToLocation(client1,"Wroclaw");
        service.addClientToLocation(client2,"Warszawa");
        service.sendAlert(alert,"Wroclaw");
        service.sendInfo(info);
        //then
        Mockito.verify(client1,Mockito.times(1)).receive(alert);
        Mockito.verify(client1,Mockito.times(1)).receive(info);

        Mockito.verify(client2,Mockito.never()).receive(alert);
        Mockito.verify(client2,Mockito.times(1)).receive(info);
    }
}