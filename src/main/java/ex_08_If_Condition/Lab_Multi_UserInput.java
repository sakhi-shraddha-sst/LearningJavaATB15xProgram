package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_Multi_UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Side 1 : ");
        int side1 = scanner.nextInt();

        System.out.println("Enter the Side 2 : ");
        int side2 = scanner.nextInt();

        System.out.println("Enter the Side 3 : ");
        int side3 = scanner.nextInt();

        System.out.println(side1+side2+side3);
        scanner.close();
    }
}
