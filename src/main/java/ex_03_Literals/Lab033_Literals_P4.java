package ex_03_Literals;

public class Lab033_Literals_P4 {
    public static void main(String[] args) {

        int age = 65; // decimal literal - base will be 10
        System.out.println("Age: " + age);

        // Binary literal - base will be 2
        int binary_num = 0b1010;
        System.out.println("Binary Num: " + binary_num);
//https://www.rapidtables.com/convert/number/binary-to-decimal.html?x=1010


        // Octal literal - base will be 8
        int octal = 0101;
        System.out.println("Octal Num: " + octal);

        // Hexadecimal literal - base will be 16
        int hex_num = 0xface;
        System.out.println("Hex Num: " + hex_num);
//https://www.rapidtables.com/convert/number/hex-to-decimal.html?

        // base 16 color combination are in hex format - #28a745



    }
}
