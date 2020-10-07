package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File washCardId = new File("D:/Programs/IdeaProjects/CarWash/validNumbers.txt");
        Scanner inputUser = new Scanner(System.in);
        Scanner inputWashCardId = new Scanner(washCardId);

        ArrayList<Object> list = new ArrayList<>();
        while (inputWashCardId.hasNextLine()) {
            list.add(inputWashCardId.nextLine());
        }

        System.out.println("Indsæt Vaskekort");

        while (true) {
            String s = inputUser.next();
            if (list.contains(s)) {
                System.out.println("Korrekt");
                break;
            } else if (s.equalsIgnoreCase("afslut")) {
                System.out.println("Du har afsluttet");
                break;
            } else {
                System.out.println("Forkert, prøv igen eller tryk afslut");
            }
        }
    }
}