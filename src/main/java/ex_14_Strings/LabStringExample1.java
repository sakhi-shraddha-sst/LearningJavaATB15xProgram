package ex_14_Strings;

public class LabStringExample1 {
    public static void main(String[] args) {
            String s= "java";
            char c = s.charAt(2);
        System.out.println(c); //v


        int result = "ABC".compareTo("abc");
        int result2 = "abc".compareTo("abc");
        int result3 = "abc".compareTo("ABC");
        System.out.println(result); // -32
        System.out.println(result2); // 0
        System.out.println(result3); // 32

        int idx = "Java".indexOf("a");
        System.out.println(); //1

        int idx2 = "java".lastIndexOf("a");
        System.out.println(idx2); // 3

        boolean b = "".isEmpty();
        System.out.println(b); // true

        String s11 = String.join("*", "Java", "python");
        System.out.println(s11); // Java*python

        String s12 = "Java".replace('a', 'o');
        System.out.println(s12); // Jovo

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1); // true

        String b2  = "Java".concat("Mava");
        System.out.println(b2); // JavaMava
    }
}
