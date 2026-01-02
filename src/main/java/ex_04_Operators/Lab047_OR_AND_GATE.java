package ex_04_Operators;

public class Lab047_OR_AND_GATE     {
    public static void main(String[] args) {

        System.out.println(true || true);  // True
        System.out.println(true || false); // True
        System.out.println(false || true); // True
        System.out.println(false || false);// False
        System.out.println("---------------");
        System.out.println(true && true);  // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false);// False

        // And && // only true when both are true
        // Or  || // only false when both are false

        // Truth Table
        // A     B     A OR B    A AND B
        // T     T       T         T
        // T     F       T         F
        // F     T       T         F
        // F     F       F         F






    }
}
