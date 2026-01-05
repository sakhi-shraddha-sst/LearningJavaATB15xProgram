package ex_08_If_Condition;

import java.util.Scanner;

public class Lab084_IF_ELSEIF_ELSE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if(age > 35){
            System.out.println("age > 35");
        } else if (age < 35) {
            System.out.println("age < 35");
        }else {
            System.out.println(" age == 35");
        }

        scanner.close();

    }

}
