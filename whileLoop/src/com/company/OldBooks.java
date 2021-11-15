package com.company;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String bookName=scan.nextLine();
        String input=scan.nextLine();
        int count=0;
        boolean found=false;

        while(!input.equals("No More Books")){
             if(input.equals(bookName)) {
                 found = true;
                 break;
             }

             count++;
             input= scan.nextLine();

        }
     if(found){
         System.out.printf("You checked %d books and found it.",count);

     }else{
         System.out.printf("The book you search is not here!%nYou checked %d books.",count);

     }

    }
}
