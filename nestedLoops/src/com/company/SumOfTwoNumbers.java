package com.company;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int num1=Integer.parseInt(scan.nextLine());
        int num2=Integer.parseInt(scan.nextLine());
        int magicNum=Integer.parseInt(scan.nextLine());
        int combinationCounter=0;
        boolean flag=false;

        for (int i = num1; i <=num2 ; i++) {
            for (int j = num1; j <=num2; j++) {
                combinationCounter++;
                int sum=i+j;

                if(sum==magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)",combinationCounter,i,j,magicNum);
                   return;
               }else{

                    flag=true;
                }

            }
        }
    if(flag) {
    System.out.printf("%d combinations - neither equals %d", combinationCounter, magicNum);
     }
    }
}
