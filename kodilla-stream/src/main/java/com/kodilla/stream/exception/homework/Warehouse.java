package com.kodilla.stream.exception.homework;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> result = orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst();
        return result.orElseThrow(OrderDoesntExistException::new);
    }
}
