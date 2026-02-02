package ex_15_StringBuffer_Builder_StringFunctions;

import java.sql.SQLOutput;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Sakhi";

        System.out.println(name.length()); //5

        System.out.println(name.charAt(3)); // h

//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException

        // 2. Concat
        System.out.println(name.concat(" Mali")); // Sakhi Mali

        //3. Contains
        System.out.println(name.contains("khi")); // true

        // 4. Equals
        System.out.println(name.equals("Sakhi")); // true

        // 5. equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("sakhi")); // true

        // 6. indexOf
        System.out.println(name.indexOf('k')); // 2

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf('m')); // 1

        // 7. length
        System.out.println(s1.length()); // 5

        // 8. replace
        System.out.println(name.replace('k', 'K')); // SaKhi

        // 10. substring( , )
        System.out.println(name.substring(1, 3)); //ak

        // 11. toLowerCase()
        System.out.println("SAKHI".toLowerCase()); // sakii

        // 12. toUpperCase()
        System.out.println("sakhi".toUpperCase()); // SAKHI

        // 14. startsWith()
        System.out.println(name.startsWith("s")); // true

        // 15. endsWith()
        System.out.println(name.endsWith("i")); // true

        // 16. trim()
        String name3 = "    Sakhi Mali     ";
        System.out.println(name3.trim()); // "Sakhi Mali"

        // 17. compareTo()
        System.out.println(name.compareTo("Sakhi")); // 0


// ----------------------------------------------------

        StringBuilder sb = new StringBuilder("Sakhi");
        System.out.println(sb); // Sakhi

        sb.reverse();
        System.out.println(sb); // ihkaS

        StringBuilder sb2 = new StringBuilder("Hi");
        System.out.println(sb2.toString()); // Hi


    }

}
