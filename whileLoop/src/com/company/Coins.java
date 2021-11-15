package com.company;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double money=Double.parseDouble(scan.nextLine());
        double coins=money*100;
        int numCoins=0;

        while(coins>0){
            if(coins>=200){
                coins-=200;
                numCoins++;
            }else if(coins>=100){
                coins-=100;
                numCoins++;
            }
            else if(coins>=50){
                coins-=50;
                numCoins++;
            }
            else if(coins>=20){
                coins-=20;
                numCoins++;
            }
            else if(coins>=10){
                coins-=10;
                numCoins++;
            }
            else if(coins>=5){
                coins-=5;
                numCoins++;
            }
            else if(coins>=2){
                coins-=2;
                numCoins++;
            }
            else if(coins>=1){
                coins-=1;
                numCoins++;
            } else{
                coins=0;
            }
        }

        System.out.println(numCoins);

    }
}
