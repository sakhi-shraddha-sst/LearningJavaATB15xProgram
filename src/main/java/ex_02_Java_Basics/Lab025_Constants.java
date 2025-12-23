package ex_02_Java_Basics;

public class Lab025_Constants {
    public static void main(String[] args) {
        int a = 10;
        a = 20;
        System.out.println(a);


        final float PI = 3.14f;
//        PI = 2.34f; // error: cannot assign a value to final variable PI
        System.out.println(PI);
    }
}
