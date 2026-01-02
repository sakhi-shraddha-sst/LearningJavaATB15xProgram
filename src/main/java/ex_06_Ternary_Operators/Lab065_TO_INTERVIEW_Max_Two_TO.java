package ex_06_Ternary_Operators;

public class Lab065_TO_INTERVIEW_Max_Two_TO {
    public static void main(String[] args) {


        int x = 10;
        int y = 20;

        int max = x > y ? x : y;
        int min = x > y ? y : x;

        System.out.println("max : "+ max);
        System.out.println("min : "+ min);

//        int maximum = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);

//        System.out.println("MAX OUT OF THREE : " + maximum);
    }
}
