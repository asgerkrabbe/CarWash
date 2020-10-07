package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Scanner textxcan = new Scanner(new File("D:/Programs/IdeaProjects/CarWash/validNumbers.txt"));

        ArrayList<Object> list = new ArrayList<>();
        while (textxcan.hasNextLine()) {
            list.add(textxcan.nextLine());
        }

        System.out.println("Tast kode eller tast afslut for at afslutte");

        while (true) {
            String s = scanner.next();
            if (list.contains(s)) {
                System.out.println("Korrekt");
                break;
            } else if (s.equalsIgnoreCase("afslut")) {
                System.out.println("Du har afsluttet");
                break;
            } else {
                System.out.println("Forkert, prøv igen eller afslut");
            }
        }
    }
}