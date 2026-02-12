package task;

import java.util.Scanner;

public class Jan16_ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str = sc.next();

        String reverseString = "";

        for(int i =str.length() -1; i >=0; i--){
            reverseString = reverseString + str.charAt(i);
        }
        System.out.println(reverseString);
    }
}
