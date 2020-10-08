package com.company;

public class Admin {
    private String password ="1234";

    public void adminMenu(String Password){
        if (password.equals(Password)){
            System.out.println("Password correct");
        }
        else {
            System.out.println("Password incorrect");
        }
    }

}
