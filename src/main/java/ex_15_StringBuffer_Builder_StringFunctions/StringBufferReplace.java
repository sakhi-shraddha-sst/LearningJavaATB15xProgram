package ex_15_StringBuffer_Builder_StringFunctions;

public class StringBufferReplace {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Java Programming");
        stringBuffer.replace(5, 16,"DevOps");
        System.out.println(stringBuffer); // Java DevOps
    }
}
