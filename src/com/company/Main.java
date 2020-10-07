package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        String file = "/Users/AndreasGargulak/Documents/KEA/CarWash/validNumbers";
        File washCardId = new File(file);
        Scanner inputUser = new Scanner(System.in);
        Scanner inputWashCardId = new Scanner(file);

        System.out.println("Insert your card(Enter cardnumber) to start carwash: ");
        String enteredNumber = inputUser.nextLine();

        while (inputWashCardId.hasNext()){
            String id = inputWashCardId.next();
            if(enteredNumber.equals(id)){
                System.out.println("korrekt");

            }
            else {
                System.out.println("prøv igen");

            }
        }


        }
    }

