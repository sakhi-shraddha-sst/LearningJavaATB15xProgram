package ex_02_Java_Basics;

public class Lab024_printF {

    public static void main(String[] args) {
//        System.out.println("It will add a new line.");
//
//        System.out.print("It will not add a new line");

        byte a = 10;

//        System.out.println("The value of a is -> " + a);
//        System.out.print("The value of a is -> " + a);

//        System.out.printf("The value of a is -> %d", a);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        int aa = 100;
        int bb = 200;

        System.out.printf("Formatting the aa = %d and bb = %d", aa, bb);
        System.out.println();

        int table = 9;
        System.out.printf("%dx1 = %d", table, table*1);
        System.out.println();

        System.out.printf("%dx2 = %d", table, table*2);


    }
}
