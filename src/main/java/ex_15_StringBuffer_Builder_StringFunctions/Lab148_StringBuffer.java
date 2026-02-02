package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sf = new StringBuffer("Java");
        sf.append(" Programming");
        System.out.println(sf); // Java Programming

        sf.replace(0, 4, "Python");
        System.out.println(sf); // Python Programming

    }
}
