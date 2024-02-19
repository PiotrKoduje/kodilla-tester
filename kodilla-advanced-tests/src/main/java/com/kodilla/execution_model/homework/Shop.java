package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Shop {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public List<Order> getOrdersByDate(LocalDate dMin, LocalDate dMax){
        List<Order> result = orders
                .stream()
                .filter(o -> o.getDate().isAfter(dMin))
                .filter(o -> o.getDate().isBefore(dMax))
                .collect(Collectors.toList());
        return result;
    }

    public List<Order> getOrdersByPrice(double pMin,double pMax){
        List<Order> result = orders
                .stream()
                .filter(o -> o.getValue() >= pMin)
                .filter(o -> o.getValue() <= pMax)
                .collect(Collectors.toList());
        return result;
    }

    public int getNumberOfOrders(){
        return orders.size();
    }

    public double getValueOfAllOrders(){
        double sum = orders
                .stream()
                .mapToDouble(o -> o.getValue())
                .sum();
        return sum;
    }
}
