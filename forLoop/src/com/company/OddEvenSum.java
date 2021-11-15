package com.company;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        int sum1=0;
        int sum2=0;

        for(int i=0;i<n;i++){
            int num = Integer.parseInt(scan.nextLine());
            if(i%2==0){
                sum1=sum1+num;
            } else{
                sum2=sum2+num;
            }

        }

        int diff=sum1-sum2;

        if (diff==0){
            System.out.println("Yes");
            System.out.println("Sum = "+sum1 );
        } else {
            System.out.println("No");
            System.out.println("Diff = "+Math.abs(diff));
        }

    }
}
