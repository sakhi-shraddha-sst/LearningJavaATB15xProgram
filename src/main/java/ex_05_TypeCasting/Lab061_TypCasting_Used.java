package ex_05_TypeCasting;

public class Lab061_TypCasting_Used {
    public static void main(String[] args) {

        int course = 100;
        float NSM_GST  = 18.45f;

//        int total = course + NSM_GST; // Narrowing - implicit  > not allowed
        int total = course + (int)NSM_GST; // Narrowing - implicit  > not allowed
        System.out.println(total); // 118 > .45 is missing

        float total2 = course + NSM_GST;  // Widening  -Implicit
        float total3 = (float)course + NSM_GST; // Widening  -Explicit

        System.out.println(total2);  // 118.45


    }
}
