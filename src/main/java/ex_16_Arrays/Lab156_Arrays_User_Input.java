package ex_16_Arrays;

import java.util.Scanner;

public class Lab156_Arrays_User_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] number_marks = new int[size];
        for(int i = 0; i < number_marks.length; i++){
            System.out.println("Enter marks " + (i+1) + " : ");
            number_marks[i] = sc.nextInt();
        }

        int sum = 0;

        for(int mark : number_marks){
            sum = sum + mark;
        }
        System.out.println("Total marks: " + sum);

        // Average marks
        double average = (double) sum / size;
        System.out.println("Average marks: " + average);

        // percentage
        double percentage = (sum / (size * 100.0)) * 100;
        System.out.println("Percentage: " + percentage + "%");


    }
}
