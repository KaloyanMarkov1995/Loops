package com.company;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command=scan.nextLine();
        int primeSum=0;
        int complexSum=0;

        while(!command.equals("stop")){

         int num=Integer.parseInt(command);
         int isPrimeCount=0;


            if(num<0){
                System.out.println("Number is negative.");
                command=scan.nextLine();
                continue;
            }

            for (int i = num; i >=1 ; i--) {
                if(num%i==0){
                    isPrimeCount++;
                }
            }

            if(isPrimeCount==2){
                primeSum+=num;
            }

            if(isPrimeCount>2){
                complexSum+=num;
            }


            command=scan.nextLine();

        }

        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",complexSum);

    }
}
