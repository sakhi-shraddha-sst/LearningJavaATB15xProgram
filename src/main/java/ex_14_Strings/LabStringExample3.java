package ex_14_Strings;

public class LabStringExample3 {
    public static void main(String[] args) {
        String s = "Java".substring(2);
        System.out.println(s); //va

//        "unhappy".substring(2) return "happy";
//
//        "haribson".substring(3) return "bison";
//
//        "emptiness".substring(9) return "" (an empty string)

            char[] arr = "Java".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']

        boolean b = " ".isBlank();
        boolean b1 = "".isEmpty();
        System.out.println(b); // true
        System.out.println(b1); // true

        String s2  = "ab".repeat(3);
        System.out.println(s2); // ababab

        String s3 = "Sakhi".repeat(3);
        System.out.println(s3); //SakhiSakhiSakhi

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11); // true

        long count = "a\nb\nc".lines().count();
        System.out.println(count); // 3


        System.out.println("=".repeat(10)); //==========
        System.out.println("Here we got");
        System.out.println("=".repeat(10)); //==========



    }
}
