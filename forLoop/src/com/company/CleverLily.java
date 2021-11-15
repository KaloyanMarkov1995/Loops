package com.company;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int age=Integer.parseInt(scan.nextLine());
        double priceWashingMachine=Double.parseDouble(scan.nextLine());
        int priceToy=Integer.parseInt(scan.nextLine());
        int sumPriceToy=0;
        int sumMoney=0;
        int brotherMoney=0;
        int k=0;

        for(int i=1 ;i<=age;i++){

         if(i%2!=0){
         sumPriceToy =sumPriceToy+priceToy;
         }
         else {
              k++;
             sumMoney=sumMoney+k;
             brotherMoney ++;
         }

        }



int sumFinal=sumPriceToy+sumMoney*10-brotherMoney;

        if(sumFinal>=priceWashingMachine){
            System.out.printf("Yes! %.2f",sumFinal-priceWashingMachine);
        }else{
            System.out.printf("No! %.2f",priceWashingMachine-sumFinal);
        }

    }
}
