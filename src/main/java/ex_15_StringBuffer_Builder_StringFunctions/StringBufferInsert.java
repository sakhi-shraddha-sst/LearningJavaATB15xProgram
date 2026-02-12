package ex_15_StringBuffer_Builder_StringFunctions;

public class StringBufferInsert {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.insert(4, " Programming");
        System.out.println(stringBuffer); // Java Programming
    }
}
