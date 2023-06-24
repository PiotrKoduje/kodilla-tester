package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {
    @Test
    public void cashmachinesArrayShouldBeEmptyAndVariableSizeShouldEqualsZero(){
        Bank bank = new Bank();
        int numberOfCashMachines = bank.getCashMachines().length;
        int size = bank.getSize();
        assertEquals(0,numberOfCashMachines);
        assertEquals(0,size);
    }

    @Test
    public void shouldAddNewCashMachine(){
        Bank bank = new Bank();
        CashMachine cm1 = new CashMachine();
        bank.addCashMachine(cm1);
        assertEquals(1,bank.getCashMachines().length);
        assertNotNull(bank.getCashMachines()[0]);
    }

    @Test
    public void shouldReturnSaldoOfAllCashMachines(){
        Bank bank = new Bank();

        CashMachine cm1 = new CashMachine();
        cm1.makeTransaction(100);
        cm1.makeTransaction(200);

        CashMachine cm2 = new CashMachine();
        cm2.makeTransaction(300);
        cm2.makeTransaction(400);

        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        assertEquals(1000,bank.getSaldo());
    }

    @Test
    public void shouldReturnNumberOfAllPayInsAndAllPayOuts(){
        Bank bank = new Bank();

        CashMachine cm1 = new CashMachine();
        cm1.makeTransaction(100);
        cm1.makeTransaction(200);
        cm1.makeTransaction(-50);

        CashMachine cm2 = new CashMachine();
        cm2.makeTransaction(-300);
        cm2.makeTransaction(400);


        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        assertEquals(3,bank.getNumberOfPayIns());
        assertEquals(2,bank.getNumberOfPayOuts());
    }

    @Test
    public void shouldReturnAveragePayInAndPayOut(){
        Bank bank = new Bank();

        CashMachine cm1 = new CashMachine();
        cm1.makeTransaction(100);
        cm1.makeTransaction(300);
        cm1.makeTransaction(-100);

        CashMachine cm2 = new CashMachine();
        cm2.makeTransaction(-300);
        cm2.makeTransaction(500);


        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        assertEquals(300,bank.getAveragePayIn());
        assertEquals(-200,bank.getAveragePayOut());
    }
}