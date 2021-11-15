package com.company;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        int group1=0;
        int group2=0;
        int group3=0;

        for(int i=1;i<=n;i++) {
            int num = Integer.parseInt(scan.nextLine());

           if(num%2==0){
                group1++;
            }
            if(num%3==0){
                group2++;
            }
            if(num%4==0){
                group3++;
            }


        }
        double p1=group1*1.0/n*100;
        double p2=group2*1.0/n*100;
        double p3=group3*1.0/n*100;

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
    }
}
