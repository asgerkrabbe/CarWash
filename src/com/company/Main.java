package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        File washCardId = new File("D:\\Programs\\IdeaProjects\\CarWash\\validNumbers.txt");
        Scanner inputUser = new Scanner(System.in);
        Scanner inputWashCardId = new Scanner(washCardId);

        System.out.println("Insert your card(Enter cardnumber) to start carwash: ");
        String enteredNumber = inputUser.nextLine();
        String invalidID = "999999";

        while (inputWashCardId.hasNext()) {
            String id = inputWashCardId.next();

            if (id.equals(enteredNumber)) {
                System.out.println("korrekt");
                break;
            }
            else if (id.equals(invalidID))
            {
                System.out.println("Forkert ID, prøv igen.");
            }
        }
    }


}