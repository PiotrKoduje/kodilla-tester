package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {

    @Test
    public void transactionsArrayShouldBeEmptyAndVariableSizeShouldEqualsZero(){
        CashMachine cashMachine = new CashMachine();
        int numberOfTransactions = cashMachine.getTransactions().length;
        int size = cashMachine.getSize();
        assertEquals(0,numberOfTransactions);
        assertEquals(0,size);
    }

    @Test
    public void shouldntMakeTransactionIfAmountEqualsZero(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.makeTransaction(0);
        assertEquals(0,cashMachine.getTransactions().length);
        assertEquals(0,cashMachine.getSize());


    }

    @Test
    public void shouldMakePositiveAndNegativeTransaction(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.makeTransaction(300);
        cashMachine.makeTransaction(-200);
        assertEquals(300,cashMachine.getTransactions()[0]);
        assertEquals(-200,cashMachine.getTransactions()[1]);
        assertEquals(2,cashMachine.getTransactions().length);
    }

    @Test
    public void shouldReturnSaldo(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.makeTransaction(300);
        cashMachine.makeTransaction(-200);
        assertEquals(100,cashMachine.getSaldo());
    }

    @Test
    public void shouldReturnNumberOfTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.makeTransaction(300);
        cashMachine.makeTransaction(-200);
        cashMachine.makeTransaction(400);
        cashMachine.makeTransaction(-50);
        assertEquals(4,cashMachine.getNumberOfTransations());
    }

    @Test
    public void shouldReturnNumberOfPayInsAndPayOuts(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.makeTransaction(300);
        cashMachine.makeTransaction(-200);
        cashMachine.makeTransaction(400);
        cashMachine.makeTransaction(-50);
        cashMachine.makeTransaction(150);
        assertEquals(3,cashMachine.getNumberOfPayIns());
        assertEquals(2,cashMachine.getNumberOfPayOuts());
    }

    @Test
    public void shouldReturnAveragePayInAndAvaragePayOut(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.makeTransaction(300);
        cashMachine.makeTransaction(-200);
        cashMachine.makeTransaction(400);
        cashMachine.makeTransaction(-100);
        cashMachine.makeTransaction(200);
        assertEquals(300,cashMachine.getAveragePayIn());
        assertEquals(-150,cashMachine.getAveragePayOut());
    }
}