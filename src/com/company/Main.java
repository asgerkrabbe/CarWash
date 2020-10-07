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
        ArrayList<WashCard> listWashCard = new ArrayList<WashCard>();
        while (inputWashCardId.hasNext()) {
            listWashCard.add(new WashCard(inputWashCardId.next()));
        }
        inputWashCardId.close();
        //while (true) {
            for (int i = 0; i < listWashCard.size(); i++) {
                if (listWashCard.get(i).equals(enteredNumber)) {
                   // break;
                }
                else {
                    System.out.println("Prøv igen");
                    //continue;
                }

            //}

        }
    }

    }

