package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File washCardId = new File("/Users/AndreasGargulak/Documents/KEA/CarWash/validNumbers.txt");
        Scanner inputUser = new Scanner(System.in);
        Scanner inputWashCardId = new Scanner(washCardId);

        ArrayList<Object> list = new ArrayList<>();
        while (inputWashCardId.hasNextLine()) {
            list.add(inputWashCardId.nextLine());
        }
        System.out.println("Insert washcard");

        while (true) {
            String id = inputUser.next();
            if (list.contains(id)) {
                System.out.println("Card accepted!");
                break;
            } else if (id.equalsIgnoreCase("cancel")) {
                System.out.println("You've cancelled the action");
                break;
            } else {
                System.out.println("Cannot accept washcard, please try again");
            }
        }

        while (true){
            UI ui = new UI();
            ui.showMenu();
            int choice = inputUser.nextInt();



            switch (choice){
                case 1:
                    ui.pressOne();
                    choice = inputUser.nextInt();
            }
        }
    }
}