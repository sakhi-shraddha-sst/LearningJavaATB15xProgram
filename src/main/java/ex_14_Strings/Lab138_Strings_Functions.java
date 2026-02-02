package ex_14_Strings;

public class Lab138_Strings_Functions {
    public static void main(String[] args) {
        char c =  'A';
        System.out.println(c);

        String s1 = "ABCD";

        System.out.println(s1); //ABCD
        System.out.println(s1.length()); //4
        System.out.println(s1.toLowerCase()); //abcd
        System.out.println(s1.toUpperCase()); //ABCD
        System.out.println(s1.concat("E")); //ABCDE
        System.out.println(s1.indexOf("C")); //2
        System.out.println(s1.charAt(3)); //D


    }
}
