package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Discount {
    int price;

    public int calculateDiscount(int price) {
        this.price = price;

        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        Date date = new Date();
        int currentTime = Integer.parseInt(formatter.format(date));
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_WEEK);

        if (day > 1 && day < 7 && currentTime < 14) {
            price = (int) (price * 0.8);
            return price;

        }
        return price;
    }

    public void washChoice1(WashCard washCard, FileWriter myWriter) throws IOException {
        Discount discount = new Discount();
        price = discount.calculateDiscount(50);
        if (washCard.getBalance() < price) {
            System.out.println("you dont have enough money");
        }
        System.out.println("You've chosen the Economy wash," + price + ",-" + "will " +
                "be deducted from you card");

        washCard.deductFromBalance(price);
        myWriter.write("\n" + price);
        myWriter.close();
    }

    public void washChoice2(WashCard washCard, FileWriter myWriter) throws IOException {
        Discount discount = new Discount();
        this.price = discount.calculateDiscount(80);
        System.out.println("You've chosen the Standard wash, " + price + ",- " + "will " + "be deducted from you card");

        washCard.deductFromBalance(price);
        myWriter.write("\n" + price);
        myWriter.close();
    }

    public void washChoice3(WashCard washCard, FileWriter myWriter) throws IOException {
        System.out.println("You've chosen the DeLuxe wash, 120,- will " +
                "be deducted from you card");
        washCard.deductFromBalance(120);
        myWriter.write("\n120");
        myWriter.close();
    }

}