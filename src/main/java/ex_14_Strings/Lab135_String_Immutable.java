package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Sakhi";
        boolean result = name.contains("a");
        System.out.println(result); // true

        // Strings are immutable are in nature

        name.toLowerCase();
        System.out.println(name); //Sakhi

    }
}
