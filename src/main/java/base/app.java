package base;
import java.text.DecimalFormat;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("#.00");

        //Input
        System.out.print("How many euros are you exchanging? ");
        double euros = newScan.nextDouble();

        System.out.print("What is the exchange rate? ");
        double rate = newScan.nextDouble();

        //Calculations
        double dollars = euros * rate;

        //Output
        System.out.println(euros + " at an exchange rate of " + rate + " is");
        System.out.println(numFormat.format(dollars) + " U.S. dollars.");
    }

}
