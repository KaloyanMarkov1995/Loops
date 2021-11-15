package com.company;

import java.util.Scanner;

public class OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        double maxOdd=-1000000000.0;
        double minOdd=1000000000.0;
        double maxEven=-1000000000.0;
        double minEven=1000000000.0;
        double sumOdd=0;
        double sumEven=0;

        for(int i=1;i<=n;i++){
            double num=Double.parseDouble(scan.nextLine());

            if(i%2==0){
                sumEven+=num;
                if(num>maxEven){
                    maxEven=num;
                }
                if(num<minEven){
                    minEven=num;
                }
            }else {
                sumOdd+=num;

                if(num>maxOdd){
                    maxOdd=num;
                }
                if(num<minOdd){
                    minOdd=num;
                }
            }

        }

        System.out.printf("OddSum=%.2f,%n",sumOdd);
        if(minOdd!=1000000000.0) {
            System.out.printf("OddMin=%.2f,%n", minOdd);
        }else{
            System.out.println("OddMin=No,");
        }
        if(maxOdd!=-1000000000.0) {
            System.out.printf("OddMax=%.2f,%n", maxOdd);
        }else{
            System.out.println("OddMax=No,");
        }
        System.out.printf("EvenSum=%.2f,%n",sumEven);
        if(minEven!=1000000000.0) {
            System.out.printf("EvenMin=%.2f,%n", minEven);
        }else{
            System.out.println("EvenMin=No,");
        }
        if(maxEven!=-1000000000.0) {
            System.out.printf("EvenMax=%.2f%n", maxEven);
        }else{
            System.out.println("EvenMax=No");
        }

    }
}
