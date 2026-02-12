package ex_15_StringBuffer_Builder_StringFunctions;

public class StringBufferSubstring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World!");

        System.out.println(sb.substring(0, 5)); // Hello
        System.out.println(sb.substring(6)); // World!
    }
}
