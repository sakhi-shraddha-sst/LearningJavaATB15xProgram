package task;

import java.util.Scanner;

public class Jan19_Pyramid_Patern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of pyramid");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }

            for (int p = 1; p <= i; p++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
