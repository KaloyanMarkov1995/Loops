package com.company;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int goalSteps=10000;
        int sumSteps=0;
        String steps=scan.nextLine();

        while(!steps.equals("Going home")){
      int numSteps=Integer.parseInt(steps);
          sumSteps+=numSteps;
          if(sumSteps>=goalSteps){
              System.out.printf("Goal reached! Good job!%n%d steps over the goal!",sumSteps-goalSteps);
              break;
          }

            steps=scan.nextLine();
        }

        if(steps.equals("Going home")) {
            int bonusSteps=Integer.parseInt(scan.nextLine());
            sumSteps=sumSteps+bonusSteps;
            if(sumSteps>=goalSteps){
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!",sumSteps-goalSteps);
            }else{
            System.out.printf("%d more steps to reach goal.",goalSteps-sumSteps);
            }
        }
    }
}
