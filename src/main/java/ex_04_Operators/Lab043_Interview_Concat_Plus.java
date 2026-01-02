package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

    String firstName = "Sakhi";
    String lastName = "Mali";

    int a = 10;
    int b = 20;

        System.out.println(firstName + lastName + a + b); // SakhiMali1020
        System.out.println(a + b + firstName + lastName); // 30SakhiMali
        System.out.println(firstName + lastName + (a + b)); // SakhiMali30
        System.out.println(a + firstName + b + lastName); // 10Sakhi20Mali
        System.out.println(a + firstName + (b + lastName)); // 10Sakhi20Mali


        // BODMAS Rule
        // Brackets of Div, Mul, Add, Sub

        // First of all wherever JVM sees String It will do concatenation.
        // For the next one, also it will do concatenation.
        // But when, it will sees integer first ,it will perform a mathematical operation.
        // The second time, if it see strings, it will do concatenation.
         //
         //






    }
}
