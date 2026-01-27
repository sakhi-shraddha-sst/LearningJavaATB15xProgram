package ex_10_For_Loop;

import java.util.Scanner;

public class Lab112_For_loop_Continue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        for(int i = 0; i< num; i++){ // Time, from where to where to, 0 to 49, 50 Times
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("End");
    }
}
