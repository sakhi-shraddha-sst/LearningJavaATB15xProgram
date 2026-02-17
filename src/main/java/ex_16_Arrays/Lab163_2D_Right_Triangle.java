package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Right_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for the pattern, e.g. n = 3");
        int num = scanner.nextInt();
        for(int i = 0; i<num;i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("=".repeat(20));

        for(int i = num; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
