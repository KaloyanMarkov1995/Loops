package com.company;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int width=Integer.parseInt(scan.nextLine());
        int length=Integer.parseInt(scan.nextLine());
        int height=Integer.parseInt(scan.nextLine());
        int volume=width*length*height;
        int sumBoxVolume=0;
        boolean flag=false;
        String box=scan.nextLine();



        while (!box.equals("Done")){

            int boxVolume=Integer.parseInt(box);

            sumBoxVolume +=boxVolume;
            if(volume>=sumBoxVolume){
                box=scan.nextLine();
            }else{
                flag=true;
                break;
            }


        }

          if(flag){
              System.out.printf("No more free space! You need %d Cubic meters more.",sumBoxVolume-volume);
        }else{

              System.out.printf("%d Cubic meters left.",volume-sumBoxVolume);
          }

    }
}
