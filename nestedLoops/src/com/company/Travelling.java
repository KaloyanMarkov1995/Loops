package com.company;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String destination=scan.nextLine();

        while(!destination.equals("End")){
        double minBudged=Double.parseDouble(scan.nextLine());
        double sum=0;


        while (sum<minBudged){
            double Money =Double.parseDouble(scan.nextLine());
                sum+=Money;

        }

               System.out.printf("Going to %s!%n", destination);


            destination= scan.nextLine();
        }


    }
}
