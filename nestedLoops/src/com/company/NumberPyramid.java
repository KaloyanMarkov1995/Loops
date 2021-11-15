package com.company;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        int current=1;
        boolean isBigger=false;


        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {

                if(current>n){
                    isBigger=true;
                    break;
                }

                System.out.print(current+" ");
                current++;
            }
            if(isBigger){
                break;
            }
            System.out.println();
        }


    }
}