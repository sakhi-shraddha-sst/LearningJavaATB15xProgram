package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type


        // 1.Without Parameters and Without Return Type
        wop_wor_greet();

        // 2.Without Parameters but With Return Type
       String name =  wop_wr_greet_2();

        // 3.With Parameters and Without Return Type
        greet_with_details("Sakhi", 123, 12323);

        // 4.With Parameters and With Return Type
        int sum = sum_of_two_numbers(123, 456);

    }

    static void wop_wor_greet(){}

    static String wop_wr_greet_2(){
        return "Sakhi";
    }

    static void greet_with_details(String name, int i, int i1){

    }

    static int sum_of_two_numbers(int i, int i1){
        return i +i1;
    }
}
