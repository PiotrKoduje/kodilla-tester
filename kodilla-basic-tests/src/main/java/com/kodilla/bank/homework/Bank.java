package com.kodilla.bank.homework;

import com.kodilla.abstracts.homework.Baker;

import java.sql.SQLOutput;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank(){
        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }

    public int addCashMachine(CashMachine cm){
        if (cm == null){
            return 0;
        }
        this.size++;
        CashMachine newTab[] = new CashMachine[this.size];
        if (this.size == 1){
            newTab[0] = cm;
        }

        for (int i = 0;i < this.size - 1;i++) {
            newTab[i] = cashMachines[i];
        }

        newTab[this.size - 1] = cm;

        cashMachines = newTab;
        return 0;
    }

    public int getSaldo(){
        int sum = 0;
        for (int i = 0;i < this.cashMachines.length;i++){
            sum += this.cashMachines[i].getSaldo();
        }
        return sum;
    }

    public int getNumberOfPayIns(){
        int sum = 0;
        for (int i = 0;i < this.cashMachines.length;i++){
            sum += this.cashMachines[i].getNumberOfPayIns();
        }
        return sum;
    }

    public int getNumberOfPayOuts(){
        int sum = 0;
        for (int i = 0;i < this.cashMachines.length;i++){
            sum += this.cashMachines[i].getNumberOfPayOuts();
        }
        return sum;
    }

    public double getAveragePayIn(){
        int sum = 0;
        int div = 0;
        for (int i = 0;i < this.cashMachines.length;i++){
           for (int j = 0; j < this.cashMachines[i].getTransactions().length;j++){
               if (this.cashMachines[i].getTransactions()[j] > 0) {
                   sum += this.cashMachines[i].getTransactions()[j];
                   div++;
               }
           }
        }
        if (div == 0){
            return 0;
        }
       return sum/div;
    }

    public double getAveragePayOut(){
        int sum = 0;
        int div = 0;
        for (int i = 0;i < this.cashMachines.length;i++){
            for (int j = 0; j < this.cashMachines[i].getTransactions().length;j++){
                if (this.cashMachines[i].getTransactions()[j] < 0) {
                    sum += this.cashMachines[i].getTransactions()[j];
                    div++;
                }
            }
        }
        if (div == 0){
            return 0;
        }
        return sum/div;
    }

    public CashMachine[] getCashMachines(){
        return cashMachines;
    }

    public int getSize(){
        return size;
    }
}
