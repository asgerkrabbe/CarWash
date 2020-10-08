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
        WashCard washCard = new WashCard();

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
        program:
        while (true){
            UI ui = new UI();
            ui.showMenu();
            int choice = inputUser.nextInt();



            switch (choice){
                case 1:
                    ui.pressOne();
                    choice = inputUser.nextInt();
                    if (choice==1){
                        System.out.println("You've chosen the Economy wash, 50,- will " +
                                "be deducted from you card");
                        washCard.deductFromBalance(50);
                    }
                    if (choice==2){
                        System.out.println("You've chosen the Standard wash, 80,- will " +
                                "be deducted from you card");
                        washCard.deductFromBalance(80);
                    }
                    if (choice==3){
                        System.out.println("You've chosen the DeLuxe wash, 120,- will " +
                                "be deducted from you card");
                        washCard.deductFromBalance(120);
                    }
                    break;
                case 2:
                    System.out.println("Insert creditcard");
                    System.out.println("Insert the amount you wish to recharge");
                    choice = inputUser.nextInt();
                    //System.out.println("Write yes to confirm chosen amount: " + choice);
                    //String s = inputUser.nextLine();
                    washCard.addToBalance(choice);

                    System.out.println("Press 1 for receipt, or press 2 if you dont want one");
                    choice = inputUser.nextInt();
                    if (choice ==1){
                        System.out.println("Your total on your washcard is now: " + washCard.getBalance()+"\n");
                        break;
                    }
                    if (choice ==2){
                        break;
                    }
                case 3:
                    ui.pressThree();
                    break;
                case 5:
                    break program;
            }
        }
    }
}