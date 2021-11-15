package com.company;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String money=scan.nextLine();
        double sum=0;

        while(!money.equals("NoMoreMoney")){

            double moneySum=Double.parseDouble(money);
          if(moneySum>=0) {
              sum += moneySum;
          }else {
              System.out.println("Invalid operation!");
              break;
          }
            System.out.printf("Increase: %.2f%n",moneySum);
           money=scan.nextLine();

        }
        System.out.printf("Total: %.2f",sum);

    }
}
