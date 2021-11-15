package com.company;

import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String name=scan.nextLine();
        int year=1;
        int numBadGrade =0;
        double sumGrades=0;
        boolean flag=false;

        while(year<=12){
            double grade=Double.parseDouble(scan.nextLine());

            if(grade>=4){
             sumGrades+=grade;
                year++;
            } else{
                numBadGrade++;
            }

            if(numBadGrade>=2){
                flag=true;
                break;
            }



        }

        if(flag){
            System.out.printf("%s has been excluded at %d grade",name,year);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumGrades / 12);
        }


    }
}
