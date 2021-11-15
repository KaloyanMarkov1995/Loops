package com.company;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        String command=scan.nextLine();
        double totalGradeSum=0;
        int k=0;

        while(!command.equals("Finish")) {
            double sumGrade=0;

            for (int i = 1; i <=n ; i++){
                double grade=Double.parseDouble(scan.nextLine());
                sumGrade+=grade;
                totalGradeSum+=grade;
            }
            k++;

            System.out.printf("%s - %.2f.%n",command,sumGrade/n);
            command=scan.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.",totalGradeSum/(n*k));



    }
}
