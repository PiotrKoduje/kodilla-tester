package com.kodilla.mockito.homework2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherService {
    private Map<String, Set<Client>> subscribers = new HashMap<>();

    public void addClientToLocation(Client client, String location){
        if (this.subscribers.containsKey(location)){
            this.subscribers.get(location).add(client);
        } else {
            Set<Client> newCityGroup = new HashSet<>();
            newCityGroup.add(client);
            this.subscribers.put(location,newCityGroup);
        }
    }

    public void removeClientFromLocation(Client client, String location){
        this.subscribers.get(location).remove(client);
    }

/*
    public boolean isStillOurClient(Client client){
        int counter = 0;
        for(Map.Entry<String, Set<Client>> singleSet : subscribers.entrySet()){
            for(Client c : singleSet.getValue()){
                if (c == client) counter++;
            }
        }
        return counter > 0 ? true : false;
    }
 */

    public void sendAlert(Alert alert, String location){
        this.subscribers.get(location).forEach(c -> c.receive(alert));
    }

    void sendInfo(Info info){
        Set<Client> subscribersForInfo = new HashSet<>();
        for(Map.Entry<String, Set<Client>> singleSet : subscribers.entrySet()){
            for(Client c : singleSet.getValue()){
                subscribersForInfo.add(c);
            }
        }
        for(Client c : subscribersForInfo){
            c.receive(info);
        }
    }

    void removeClientFromService(Client client){
        this.subscribers.values().forEach(c -> c.remove(client));
    }
}
