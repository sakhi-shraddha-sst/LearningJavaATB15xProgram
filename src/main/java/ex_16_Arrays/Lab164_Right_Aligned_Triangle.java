package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_Right_Aligned_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for the pattern, e.g. n = 3");
        int num = scanner.nextInt();
        for(int i  = 0; i< num; i++){
            for(int space = 0; space < num -i -1; space++){
                System.out.print(" ");
            }
            for(int star = 0; star <=i; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
