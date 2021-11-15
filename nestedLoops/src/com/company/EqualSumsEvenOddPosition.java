package com.company;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1=Integer.parseInt(scan.nextLine());
        int num2=Integer.parseInt(scan.nextLine());



        for (int i = num1; i <=num2 ; i++) {
            int currentNum=i;
            int oddSum=0;
            int evenSum=0;


            for (int j = 1; j <= 6; j++) {

               int currentDigit=currentNum%10;
                   currentNum=currentNum/10;

                   if(j%2==0){
                       evenSum+=currentDigit;
                   }else{
                       oddSum+=currentDigit;
                   }


               }
                if(oddSum==evenSum){

                    System.out.print(i+" ");


            }




        }


    }
}
