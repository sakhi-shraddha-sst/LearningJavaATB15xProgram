package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println(age);

        double d = scanner.nextDouble();

        if(age > 19){
            System.out.println("Hi");
        }

        scanner.close();
    }
}
