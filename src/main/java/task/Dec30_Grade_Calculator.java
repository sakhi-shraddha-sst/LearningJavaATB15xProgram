package task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Dec30_Grade_Calculator {
/*
Grade Calculator:
Write a program that calculates and displays the letter grade for a given numerical score
(e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
*/
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the numerical score (0-100): ");

    int score = scanner.nextInt();

    if(score>=90 && score<=100){
        System.out.println("As per Score : " + score + " Grade is : A");
    }else if(score>=80 && score<=89){
        System.out.println("As per Score : " + score + " Grade is : B");
    }else if(score>=70 && score<=79){
        System.out.println("As per Score : " + score + " Grade is : C");
    }else if(score>=60 && score<=69){
        System.out.println("As per Score : " + score + " Grade is : D");
    }else if(score >= 0 && score<=59){
        System.out.println("As per Score : " + score + " Grade is : F");
    }else{
        System.out.println("Invalid Score Entered.");
    }
    scanner.close();
}
}
