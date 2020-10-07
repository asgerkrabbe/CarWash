package com.company;

public class WashCard {
    private int balance;
    private String cardNumber;

    public int getBalance(){
        return balance;
    }
    public int setBalance(){
        return balance;
    }

    public String getCardNumber(){
        return cardNumber;
    }
    public WashCard(int balance, String cardNumber) {
        this.balance = balance;
        this.cardNumber = cardNumber;
    }
}
