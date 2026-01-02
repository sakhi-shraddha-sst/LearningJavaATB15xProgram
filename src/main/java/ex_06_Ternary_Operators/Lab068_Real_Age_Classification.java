package ex_06_Ternary_Operators;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
//         write a program where a user will give you an age.
//         You need to check if the user is minor, adult, or senior


        // User will give you input via command line

        String age_input_string = args[0];
        System.out.println( age_input_string instanceof String);
        int age_user_input = Integer.parseInt(age_input_string);
        System.out.println(age_user_input);

        String result = (age_user_input<18) ? "Minor" : (age_user_input <= 60) ? "Adult" : "Sr. Citizen";
        System.out.println(result);
    }
}
