package com.company;

public class WashCard {
    private int balance;
    private String cardNumber;

    public int getBalance(){
        return balance;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public int addToBalance(int amount){
        balance = balance + amount;
        return balance;
    }

    public void deductFromBalance(int amount){
        balance -= amount;
    }

    public WashCard(int balance){
        this.balance = balance;
    }

    public WashCard() {
    }
}