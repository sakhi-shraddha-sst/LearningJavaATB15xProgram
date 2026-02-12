package task;

import java.util.Scanner;

public class Jan16_Reverse_String {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");

        String text = scanner.nextLine();

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        System.out.println(reverse);

    }
}