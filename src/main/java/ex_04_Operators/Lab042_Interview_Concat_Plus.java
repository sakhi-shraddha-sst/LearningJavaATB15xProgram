package ex_04_Operators;

public class Lab042_Interview_Concat_Plus {
    public static void main(String[] args) {
    // +
        int a = 10;
        int b = 20;
        System.out.println(a+b); //30

        // + -> String concatenation
        String firstName = "Sakhi";
        String lastName = "Mali";
        System.out.println(firstName + " " + lastName); // Concatenation

        //        System.out.println(firstName - lastName); // Error
        //        System.out.println(firstName * lastName); // Error
        //        System.out.println(firstName / lastName); // Error

        // + > behaves arthmatic int
        // + > behaves String concatenation

        System.out.println(a+b+firstName);



    }

}
