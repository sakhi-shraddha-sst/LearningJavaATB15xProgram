package task;

import java.util.Scanner;

public class Dec26_Triangle_Classifier {

    // Write a program that classifies a triangle based on its side lengths.
    // Given three input values representing the lengths of the sides,
    // determine if the triangle is equilateral (all sides are equal),
    // isosceles (exactly two sides are equal),
    // or scalene (no sides are equal).
    // Use an if-else statement to classify the triangle.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Side 1 : ");
        int side1 = scanner.nextInt();

        System.out.println("Enter the Side 2 : ");
        int side2 = scanner.nextInt();

        System.out.println("Enter the Side 3 : ");
        int side3 = scanner.nextInt();


        if (side1 <=0 || side2 <=0 || side3<=0) {
            System.out.println("The Triangle is invalid.");
        } else if (side1 == side2 && side2 == side3) {
            System.out.println("The Triangle is Equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The Triangle is Isosceles.");
        } else {
            System.out.println("The Triangle is Scalene.");
        }

        scanner.close();
    }
}
