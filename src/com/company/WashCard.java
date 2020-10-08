package com.company;

public class WashCard {
    private int balance= 200;
    private String cardNumber;

    public int getBalance(){
        return balance;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public void addToBalance(int amount){
        balance += amount;
    }
    public void deductFromBalance(int amount){
        balance -= amount;
    }

    public WashCard(){
    }

}
