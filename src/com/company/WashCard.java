package com.company;

public class WashCard {
    private int balance;
    private String cardNumber;

    public WashCard(int balance, String cardNumber){
        this.balance=balance;
        this.cardNumber=cardNumber;
    }

    public int getBalance(){
        return balance;
    }

    public String getCardNumber(){
        return cardNumber;
    }
}
