package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab150_String_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to check for Palindrome:");
        String input = scanner.next();

        String reverseString = "";
        for(int i = input.length() -1; i >=0; i--){
            reverseString = reverseString + input.charAt(i);
        }

        if(input.equalsIgnoreCase(reverseString)){
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }
    }
}
