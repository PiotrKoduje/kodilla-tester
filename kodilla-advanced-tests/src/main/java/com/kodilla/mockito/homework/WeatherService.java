package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {
    Set<Client> Wroclaw = new HashSet<>();
    Set<Client> Warszawa = new HashSet<>();
    Set<Client> Krakow = new HashSet<>();
    Set<Client> clients = new HashSet<>();


    public void addClientToLocation(Client client,String location){
        clients.add(client);
        switch (location){
            case "Wroclaw":
                Wroclaw.add(client);
                break;
            case "Warszawa":
                Warszawa.add(client);
                break;
            case "Krakow":
                Krakow.add(client);
                break;
            default:
                System.out.println("Wrong city");
        }
    }

    public void removeClientFromLocation(Client client,String location){
        switch (location){
            case "Wroclaw":
                Wroclaw.remove(client);
                break;
            case "Warszawa":
                Warszawa.remove(client);
                break;
            case "Krakow":
                Krakow.remove(client);
                break;
            default:
                System.out.println("Wrong city or client doesn't exist");
        }

        if (!isStillOurClient(client)){
            clients.remove(client);
        }
    }

    public boolean isStillOurClient(Client client){
        return Wroclaw.contains(client) || Warszawa.contains(client) || Krakow.contains(client);
    }

    public void sendAlert(Alert alert, String location){
        switch (location){
            case "Wroclaw":
                for(Client c : Wroclaw){
                    c.receive(alert);
                }
                break;
            case "Warszawa":
                for(Client c : Warszawa){
                    c.receive(alert);
                }
                break;
            case "Krakow":
                for(Client c : Krakow){
                    c.receive(alert);
                }
                break;
            default:
                System.out.println("Wrong city");
        }
    }

    void sendInfo(Info info){
        for(Client c : clients){
            c.receive(info);
        }
    }

    void removeLocation(String location){
        switch (location){
            case "Wroclaw":
                Wroclaw.clear();
                break;
            case "Warszawa":
                Warszawa.clear();
                break;
            case "Krakow":
                Krakow.clear();
                break;
            default:
                System.out.println("Wrong city");
        }
    }

    void removeClientFromService(Client client){
        Wroclaw.remove(client);
        Warszawa.remove(client);
        Krakow.remove(client);
        clients.remove(client);
    }
}
