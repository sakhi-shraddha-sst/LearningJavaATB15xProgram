package task;

import java.util.Scanner;

public class Task_Factorial {
    public static void main(String[] args) {
        // factorial
        System.out.println("Enter the positive number: ");
        Scanner sc = new Scanner(System.in);
//        int n = 4;
        int fact = 1;

        if(sc.hasNextInt()){
           int n = sc.nextInt();
            for(int i = 1; i <=n; i++){
                fact = fact * i;
            }
            System.out.print("Factorial of " + n + " : " + fact);

        }else{
            System.out.println("Please enter a valid integer number");
        }


    }
    }

