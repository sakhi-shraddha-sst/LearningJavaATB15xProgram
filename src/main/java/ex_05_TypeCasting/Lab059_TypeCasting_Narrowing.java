package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {

        int val = 300;
//        00000000000000000000000100101100 // 32 bits
//        byte b = val; // Implicit narrowing

        byte b1 = (byte)val; // Explicit narrowing

        System.out.println(b1);

//        00101100
//        0+0+32+0+8+4+0+0 = > 44

     }
}
