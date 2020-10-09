package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    File washCarStatistics = new File("CarWashStatistic");
    Scanner inputWashStat = new Scanner(washCarStatistics);

    public Admin() throws FileNotFoundException {
    }

    public void carStat() {
        int economyCount = 0;
        int standardCount = 0;
        int deluxeCount = 0;
        int discountEconomy = 0;
        int discountStandard = 0;
        ArrayList<Object> statisticList = new ArrayList<>();
        while (inputWashStat.hasNextLine()) {
            statisticList.add(inputWashStat.nextLine());
        }
        for (int i = 0; i <= statisticList.size() - 1; i++) {
            if (statisticList.get(i).equals("50")) {
                economyCount += 1;
            }
            if (statisticList.get(i).equals("80")) {
                standardCount += 1;
            }
            if (statisticList.get(i).equals("120")) {
                deluxeCount += 1;
            }
            if (statisticList.get(i).equals("40")) {
                discountEconomy += 1;
            }
            if (statisticList.get(i).equals("64")) {
                discountStandard += 1;
            }
        }
        System.out.println("number of Economy washes: " + economyCount);
        System.out.println("number of Standard washes: " + standardCount);
        System.out.println("number of DeLuxe washes: " + deluxeCount);
        System.out.println("number of EarlyBird Economy washes: " + discountEconomy);
        System.out.println("number of EarlyBird Standard washes: " + discountStandard);
        int totalEarning = economyCount * 50 + standardCount * 80 + deluxeCount * 120 + discountEconomy * 40 + discountStandard * 64;
        System.out.println(totalEarning + " kr");
    }

    public void adminMenu(String Password) {
        String password = "1234";
        if (password.equals(Password)) {
            System.out.println("Password correct");
            carStat();
        } else {
            System.out.println("Password incorrect");
        }
    }
}