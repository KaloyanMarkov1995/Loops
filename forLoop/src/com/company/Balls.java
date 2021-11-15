package com.company;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        int totalPoints=0;
        int redPoints=0;
        int orangePoints=0;
        int yellowPoints=0;
        int whitePoints=0;
        int otherPoints=0;
        int blackPoints=0;





        for(int i=1;i<=n;i++) {
            String color = scan.nextLine();

            switch(color){
                case"red":
               totalPoints +=5;
               redPoints++;
                    break;
                case"orange":
                    totalPoints +=10;
                    orangePoints++;
                    break;
                case"yellow":
                    totalPoints +=15;
                    yellowPoints++;
                    break;
                case"white":
                    totalPoints +=20;
                    whitePoints++;
                    break;
                case"black":
                    totalPoints=totalPoints/2;
                    blackPoints++;
                    break;
                default:
                    otherPoints++;
                    break;
            }

        }
        System.out.println("Total points: "+totalPoints);
        System.out.println("Points from red balls: "+redPoints);
        System.out.println("Points from orange balls: "+orangePoints);
        System.out.println("Points from yellow balls: "+yellowPoints);
        System.out.println("Points from white balls: "+whitePoints);
        System.out.println("Other colors picked: "+otherPoints);
        System.out.println("Divides from black balls: "+blackPoints);


    }
}
