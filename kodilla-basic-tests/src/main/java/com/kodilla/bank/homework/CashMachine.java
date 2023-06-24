package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;


    public CashMachine(){
        this.transactions = new int[0];
        this.size = 0;
    }

    public int makeTransaction(int amount){
        if (amount == 0){
            return 0;
        }
        this.size++;
        int newTab[] = new int[this.size];
        if (this.size == 1){
            newTab[0] = amount;
        }

        for (int i = 0;i < this.size - 1;i++) {
            newTab[i] = transactions[i];
        }

        newTab[this.size - 1] = amount;

        transactions = newTab;
        return 0;
    }

    int getSaldo(){
        int sum = 0;
        for (int i = 0;i < this.transactions.length;i++){
            sum += this.transactions[i];
        }
        return sum;
    }

    int getNumberOfTransations(){
        return this.transactions.length;
    }

    int getNumberOfPayIns(){
        int numberOfPayIns = 0;
        for (int i = 0;i < this.transactions.length;i++){
            if (this.transactions[i] > 0){
                numberOfPayIns++;
            }
        }
        return numberOfPayIns;
    }

    int getNumberOfPayOuts(){
        int numberOfPayOuts = 0;
        for (int i = 0;i < this.transactions.length;i++){
            if (this.transactions[i] < 0){
                numberOfPayOuts++;
            }
        }
        return numberOfPayOuts;
    }

    double getAveragePayIn(){
        double sum = 0;
        for (int i = 0;i < this.transactions.length;i++){
            if (this.transactions[i] > 0){
                sum += this.transactions[i];
            }
        }
        return sum/this.getNumberOfPayIns();
    }

    double getAveragePayOut(){
        double sum = 0;
        for (int i = 0;i < this.transactions.length;i++){
            if (this.transactions[i] < 0){
                sum += this.transactions[i];
            }
        }
        return sum/this.getNumberOfPayOuts();
    }

    public int[] getTransactions(){
        return transactions;
    }
    public int getSize(){
        return size;
    }
}
