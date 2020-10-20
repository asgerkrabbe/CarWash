package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Admin admin = new Admin();
        Discount discount = new Discount();
        FileWriter myWriter = new FileWriter("CarWashStatistic", true);
        File washCardId = new File("validNumbers.txt");
        Scanner inputUser = new Scanner(System.in);
        Scanner inputWashCardId = new Scanner(washCardId);
        UI ui = new UI();
        WashCard washCard = new WashCard(200);

        ArrayList<Object> list = new ArrayList<>();
        while (inputWashCardId.hasNextLine()) {
            list.add(inputWashCardId.nextLine());
        }

        ui.menuloop(admin, discount, washCard, myWriter, inputUser, ui, list);
    }
}
