package ex_06_Ternary_Operators;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {

        int age = 27;

        String result = age > 18 ? (age > 25 ? "You can drink" : "You cant drink") : "No cnt go to goa";

        System.out.println(result);
    }
}
