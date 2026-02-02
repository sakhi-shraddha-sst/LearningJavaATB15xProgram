package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%

        String s0 = "Sakhi";
        String s1 = new String("Sakhi");

        // less than 10% used

        StringBuffer stringBuffer = new StringBuffer("Sakhi");
        StringBuilder stringBuilder = new StringBuilder("Sakhi");
        System.out.println(stringBuffer.reverse()); // ihkaS
        System.out.println(stringBuilder.reverse()); // ihkaS
    }
}
