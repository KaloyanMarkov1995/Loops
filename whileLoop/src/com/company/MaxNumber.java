package com.company;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String number1=scan.nextLine();
        int max=Integer.MIN_VALUE;

        while(!number1.equals("Stop")){

            int number2=Integer.parseInt(number1);
            if(number2>max){
                max=number2;
            }

            number1=scan.nextLine();
        }

        System.out.println(max);
    }
}
