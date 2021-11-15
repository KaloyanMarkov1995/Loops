package com.company;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int lowGrade=Integer.parseInt(scan.nextLine());
        int numLowGrade=0;
        int problemsSolved=0;
        double gradeSum=0;
        String lastProblem="";
        boolean fail=false;

        while(numLowGrade<lowGrade)
        {
            String problemName=scan.nextLine();
            if(problemName.equals("Enough")){
                fail=true;
                break;
            }

            int grade=Integer.parseInt(scan.nextLine());
             if (grade<=4){
    numLowGrade++;
                         }
        gradeSum+=grade;
        problemsSolved++;
        lastProblem=problemName;
        }
      if(fail){
          System.out.printf("Average score: %.2f%n",gradeSum/problemsSolved);
          System.out.printf("Number of problems: %d%n",problemsSolved);
          System.out.printf("Last problem: %s",lastProblem);

      }else{

          System.out.printf("You need a break, %d poor grades.",numLowGrade);
      }

    }
}
