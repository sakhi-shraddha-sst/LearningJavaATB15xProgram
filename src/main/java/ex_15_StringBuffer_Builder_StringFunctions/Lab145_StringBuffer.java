package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Sakhi");
        stringBuffer.append(" Mali");
        System.out.println(stringBuffer); // Sakhi Mali


        String s1 = "Sakhi";
        s1 = s1 + " Mali";
        System.out.println(s1); // Sakhi Mali
        // here two are different objects created in memory
        // StringBuffer object is changed in the same memory location

    }
}
