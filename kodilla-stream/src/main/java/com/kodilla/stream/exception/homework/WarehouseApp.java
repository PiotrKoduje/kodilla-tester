package com.kodilla.stream.exception.homework;

import java.util.function.DoubleToIntFunction;

public class WarehouseApp{
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("121"));
        warehouse.addOrder(new Order("122"));
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("124"));
        warehouse.addOrder(new Order("125"));

        try {
            System.out.println("Wybrano zamówienie nr: " + warehouse.getOrder("122").getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Takie zamówienie nie istnieje");
        }
    }
}
