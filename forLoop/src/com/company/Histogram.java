package com.company;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        int group1=0;
        int group2=0;
        int group3=0;
        int group4=0;
        int group5=0;

        for(int i=1;i<=n;i++){
            int num=Integer.parseInt(scan.nextLine());

            if(num<200){
                group1++;
            }else if(num>=200 && num<400){
                group2++;
            }else if(num>=400 && num<600){
                group3++;
            }else if(num>=600 && num<800){
                group4++;
            }else{
                group5++;
            }
        }

        double p1=group1*1.0/n*100;
        double p2=group2*1.0/n*100;
        double p3=group3*1.0/n*100;
        double p4=group4*1.0/n*100;
        double p5=group5*1.0/n*100;

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%%n",p5);

    }
}
