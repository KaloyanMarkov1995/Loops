package com.company;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String number1=scan.nextLine();
        int min=Integer.MAX_VALUE;

        while(!number1.equals("Stop")){

            int number2=Integer.parseInt(number1);
            if(number2<min){
                min=number2;
            }

            number1=scan.nextLine();
        }

        System.out.println(min);
    }
}

