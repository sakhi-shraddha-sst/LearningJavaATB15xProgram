package task;

public class Ternary {

    public static void main(String[] args) {


        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int maximum = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);

        System.out.println("MAX OUT OF THREE : " + maximum);


    }
}











//
//int marks = 100;
//
//String result  = (marks >=40) ? "pass" : "fail";
//        System.out.println("Result: " + result);
//
