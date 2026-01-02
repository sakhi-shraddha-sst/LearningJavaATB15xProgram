package ex_06_Ternary_Operators;

public class Lab069_CLI_INPUTS {
    public static void main(String[] args) {

        int marks  = Integer.parseInt(args[0]);
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
