package com.company;

import java.io.File;
import java.util.ArrayList;

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
