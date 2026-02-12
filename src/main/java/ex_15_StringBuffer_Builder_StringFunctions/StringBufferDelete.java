package ex_15_StringBuffer_Builder_StringFunctions;

public class StringBufferDelete {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Java Programming");
        stringBuffer.delete(5, 16);
        System.out.println(stringBuffer); // Java
    }
}
