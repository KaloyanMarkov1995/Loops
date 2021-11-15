package com.company;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<n;i++){
            int num=Integer.parseInt(scan.nextLine());

            if(num>max){
               max=num ;
            }

            if(num<min){
               min=num;
            }
        }

        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);

    }
}
