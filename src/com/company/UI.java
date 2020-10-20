package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    Admin admin;
    UI ui;
    Discount discount;
    WashCard washCard;
    FileWriter fileWriter;
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Press 1 to start carwash: ");
        System.out.println("Press 2 to recharge your washcard: ");
        System.out.println("Press 3 to see your balance");
        System.out.println("Press 4 for admin log-on: ");
        System.out.println("Press 5 to quit: ");
    }

    public void pressOne() {
        System.out.println("Weekdays before 14 you're eligible for a 20% discount");
        System.out.println("Press 1 for wash type Economy: ");
        System.out.println("Press 2 for wash type Standard");
        System.out.println("Press 3 for wash type DeLuxe");
    }

    public void pressThree(WashCard washCard) {
        System.out.println("Your balance is: " + washCard.getBalance() + "\n");
    }


    public void chargeCard(WashCard washCard) {
        System.out.println("Insert creditcard");
        System.out.println("Insert the amount you wish to recharge");
        int choice = scanner.nextInt();
        washCard.addToBalance(choice);

        System.out.println("Press 1 for receipt, or press 2 if you dont want one");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Your total on your washcard is now: " + washCard.getBalance() + "\n");
        }
    }

    public void menuloop(Admin admin, Discount discount, WashCard washCard, FileWriter fileWriter, Scanner scanner, UI ui, ArrayList<Object> arrayList) throws IOException {
        System.out.println("Insert washcard");

        while (true) {
            String id = scanner.next();
            if (arrayList.contains(id)) {
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
        while (true) {
            ui.showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ui.pressOne();
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        discount.washChoice1(washCard, fileWriter);
                        break program;
                    }
                    if (choice == 2) {
                        discount.washChoice2(washCard, fileWriter);
                        break program;
                    }
                    if (choice == 3) {
                        discount.washChoice3(washCard, fileWriter);
                        break program;
                    }
                    break;
                case 2:
                    ui.chargeCard(washCard);
                    break;
                case 3:
                    ui.pressThree(washCard);
                    break;
                case 4:
                    System.out.println("Enter admin password");
                    String password = scanner.next();
                    admin.adminMenu(password);
                    break program;
                case 5:
                    break program;
            }
        }
    }
}