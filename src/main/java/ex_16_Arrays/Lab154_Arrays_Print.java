package ex_16_Arrays;

import java.text.Format;

public class Lab154_Arrays_Print {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 95};

        System.out.println(marks.length); // 4
        System.out.println(marks[0]); // 51
        System.out.println(marks[1]); // 100
        System.out.println(marks[2]); // 91
        System.out.println(marks[3]); // 95

        System.out.println("=".repeat(30));

        for(int mark : marks){
            System.out.println(mark);
        }

        System.out.println("=".repeat(30));

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
