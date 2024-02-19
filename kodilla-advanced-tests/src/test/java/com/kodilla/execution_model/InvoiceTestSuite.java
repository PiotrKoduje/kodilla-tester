package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
 /*   Invoice invoice = new Invoice();
    @Test
    public void shouldAddSeveralItemsToTheInvoice(){
        assertEquals(0,invoice.getSize());
        invoice.addItem(new Item("Pen",1.5));
        assertEquals(1,invoice.getSize());
        invoice.addItem(new Item("Notebook",3));
        assertEquals(2,invoice.getSize());
    }

    @Test
    public void shouldReturnSpecificItem(){
        invoice.addItem(new Item("Pen",1.5));
        invoice.addItem(new Item("Notebook",3));
        invoice.addItem(new Item("Scissors",5));
        assertEquals("Scissors",invoice.getItem(2).getName());
        assertEquals(5,invoice.getItem(2).getPrice());
    }

    @Test
    public void shouldReturnNull(){
        invoice.addItem(new Item("Pen",1.5));
        invoice.addItem(new Item("Notebook",3));
        assertNull(invoice.getItem(-1));
        assertNull(invoice.getItem(5));
    }

    @Test
    public void shouldClearTheInvoice(){
        invoice.addItem(new Item("Pen",1.5));
        invoice.addItem(new Item("Notebook",3));
        invoice.clear();
        assertEquals(0,invoice.getSize());
    }*/

    //////////////////////////////////////////////////  OR   //////////////////////////////////////////////////////////

    Invoice invoice = new Invoice();
    Item pen = new Item("Pen",1.5);
    Item notebook = new Item("Notebook",3);
    Item scissors = new Item("Scissors",5);

    @Test
    public void shouldAddSeveralItemsToTheInvoice(){
        //When
        int numberOfItems = invoice.getSize();
        //Then
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldReturnSpecificItem(){
        assertEquals("Scissors",invoice.getItem(2).getName());
        assertEquals(5,invoice.getItem(2).getPrice());
    }

    @Test
    public void shouldReturnNull(){
        assertNull(invoice.getItem(-1));
        assertNull(invoice.getItem(5));
    }

    @Test
    public void shouldClearTheInvoice(){
        invoice.clear();
        assertEquals(0,invoice.getSize());
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(pen);
        invoice.addItem(notebook);
        invoice.addItem(scissors);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}