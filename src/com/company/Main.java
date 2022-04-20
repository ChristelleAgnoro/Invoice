package com.company;

import java.util.ArrayList;
import java.util.Scanner;

//defining main class
public class Main {
    public static void main(String[] args) {

        //creating ArrayLists
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        //taking input from user
        Scanner input = new Scanner(System.in);

        //Adding products and prices
        products.add("Bison Sweater");
        prices.add(55.99);
        products.add("Bison Tee");
        prices.add(14.99);
        products.add("Bison Hoodie");
        prices.add(23.99);
        products.add("Bison Bumpersticker");
        prices.add(4.99);

        String answer;
        ArrayList<String> purchases = new ArrayList<>();

        do {
            System.out.println("What do you want to do?");
            System.out.println("1) Add your purchase 2) Change your purchase 3) Show your purchases 4) Finish your transaction");

            answer = input.nextLine();
            switch (answer) {
                case "1":
                    System.out.println("What do you wish to buy?");
                    answer = input.nextLine();
                    purchases.add(answer);
                    break;

                //adding options for change the purchase
                case "2":
                    //takes item that the user want to change
                    System.out.println("What purchase you want to change?");
                    String change = input.nextLine();

                    //change to new purchase
                    System.out.println("What you want to change with?");
                    String changewith = input.nextLine();

                    purchases.set(purchases.indexOf(change), changewith);
                    break;

                //displaying the purchases information
                case "3":
                    for (String purchase : purchases) {
                        System.out.println(purchase);
                    }
                    break;
            }
        } while (! answer.equals("4"));

        //calculating total cost
        double totalcost = 0.0;
        int j;
        for (String purchase : purchases) {
            j = 0;
            do {

                // condition is check if the value in purchases at position i is equal to the value in products at position j
                if (purchase.equals(products.get(j))) {

                    // increment totalcost with the ith value in the prices array
                    totalcost = totalcost + prices.get(j);
                }
                j++;
            } while (j < products.size());
        }
        System.out.println("Total Cost: "+totalcost);
    }
}