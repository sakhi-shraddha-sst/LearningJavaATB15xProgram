package ex_16_Arrays;

public class Lab152_Arrays {
    public static void main(String[] args) {

        int[] marks = {1,2,3,4,5,6,7};

        // 2nd way to create an array
        int[] marks2 = new int[5];
        int marks3[] = new int[4]; // fixed size

        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        System.out.println(names[1]);
    }
}
