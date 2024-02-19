package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import javax.swing.plaf.PanelUI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(34.5,LocalDate.of(2023,11,27),"Piotr");
    Order order2 = new Order(74.15,LocalDate.of(2023,12,4),"Piotr");
    Order order3 = new Order(235,LocalDate.of(2024,1,10),"Gosia");
    Order order4 = new Order(17.80,LocalDate.of(2024,2,15),"Gosia");

    @Test
    public void shouldAddNewOrdersToTheList(){
        assertEquals(4,shop.orders.size());
    }

    @Test
    public void shouldReturnListOfOrdersFromSpecificRangeOfTime(){
        List<Order> result = new ArrayList<>();
        result.add(order2);
        result.add(order3);
        assertEquals(result,shop.getOrdersByDate(LocalDate.of(2023,12,1),LocalDate.of(2024,2,1)));
    }

    @Test
    public void shouldReturnListOfOrdersFromSpecificRangeOfPrice(){
        List<Order> result = new ArrayList<>();
        result.add(order1);
        result.add(order4);
        assertEquals(result,shop.getOrdersByPrice(10,50));
    }

    @Test
    public void shouldReturnSizeOfTheList(){
        assertEquals(4,shop.getNumberOfOrders());
    }

    @Test
    public void shouldReturnValueOfAllOrders(){
        assertEquals(361.45,shop.getValueOfAllOrders(),0.1);
    }

    @BeforeAll
    public static void intro(){
        System.out.println("START");
    }

    @BeforeEach
    public void initialize(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @AfterAll
    public static void outro() {
        System.out.println("THE END");
    }
}