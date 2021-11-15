package com.company;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        int sumL=0;
        int sumR=0;


        for(int i=0;i<n;i++) {
            int num = Integer.parseInt(scan.nextLine());
            sumL =sumL+num;

        }
        for(int i=0;i<n;i++) {
            int num = Integer.parseInt(scan.nextLine());

            sumR =sumR+num;
        }



        int diff=sumL-sumR;

        if (diff==0){
            System.out.println("Yes, sum = "+sumL);
        } else{
            System.out.printf("No, diff = %d",Math.abs(diff));

        }
    }
}
