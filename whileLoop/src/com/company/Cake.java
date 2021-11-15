package com.company;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int width=Integer.parseInt(scan.nextLine());
        int length=Integer.parseInt(scan.nextLine());
        boolean flag=false;
        int area=width*length;
        String pieces=scan.nextLine();

while(!pieces.equals("STOP")){
  int numPieces=Integer.parseInt(pieces);
    area-=numPieces;
    if(area>0){
        pieces=scan.nextLine();

    }else{
       flag=true;
       break;
    }

}
      if(flag){
          System.out.printf("No more cake left! You need %d pieces more.",Math.abs(area));
      }else{
          System.out.printf("%d pieces are left.",area);
      }



    }
}
