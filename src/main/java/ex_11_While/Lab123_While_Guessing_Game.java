package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int guess;
        int attempts = 0;


        while(true){
            if(!sc.hasNextInt()){
                System.out.println("Please enter a valid integer number ");
                sc.next();
                continue;
            }


            guess = sc.nextInt();
            attempts++;

            if(guess < numberToGuess){
                System.out.println("Too Low! Try Again");

            }else if(guess > numberToGuess){
                System.out.println("Too High! Try again!");
            }else{
                System.out.println("Correct Guess! You have taken " + attempts + " attempts");
                break;
            }
        }


    }
}

// till 7th Jan 2026