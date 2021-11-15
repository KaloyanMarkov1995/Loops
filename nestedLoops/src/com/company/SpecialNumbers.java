package com.company;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());



        for (int i = 1111; i <=9999 ; i++) {
               int k=i;
              int count=0;
            for (int j = 1; j <=4 ; j++) {
                int currentDigit=k%10;
                k=k/10;

                if(currentDigit==0){
                    continue;
                }

                if(n%currentDigit==0)
                {
                     count++;
                }
            }
            if(count==4) {
                System.out.print(i + " ");
            }
        }



    }
}
