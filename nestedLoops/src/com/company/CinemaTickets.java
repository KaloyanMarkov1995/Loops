package com.company;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String movieName=scan.nextLine();
        int totalTickets=0;
        int numKidTickets=0;
        int numStudentTickets=0;
        int numStandardTickets=0;


        while(!movieName.equals("Finish")){
            int takenSeats=0;
            int numSeats=Integer.parseInt(scan.nextLine());
            String typeTicket=scan.nextLine();
            int idleSeats=numSeats;
           while(!typeTicket.equals("End")){

               switch (typeTicket){

                   case"student":numStudentTickets++;
                       break;
                   case"kid":numKidTickets++;
                       break;
                   case"standard":numStandardTickets++;
                       break;

               }

               idleSeats--;
             takenSeats++;

             if(idleSeats==0){break;}

            typeTicket=scan.nextLine();
           }
            totalTickets+=takenSeats;

            System.out.printf("%s - %.2f%% full.%n",movieName,takenSeats*1.0/numSeats*100);




            movieName=scan.nextLine();
        }
        System.out.println("Total tickets: "+totalTickets);
        System.out.printf("%.2f%% student tickets.%n",numStudentTickets*1.0/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",numStandardTickets*1.0/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.%n",numKidTickets*1.0/totalTickets*100);
    }
}
