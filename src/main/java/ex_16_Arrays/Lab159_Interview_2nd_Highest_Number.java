package ex_16_Arrays;

import java.util.Arrays;

public class Lab159_Interview_2nd_Highest_Number {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32}; // 100, 34

//        Arrays.sort(numbers);
//        System.out.println("2nd highest number : " + numbers[numbers.length-2]);

        int max = 0;
        int max2 = 0;

        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] > max) {
                max2 = max;
                max = numbers[i];
                }
            else if(numbers[i] > max2 && numbers[i] != max){
                max2 = numbers[i];
            }
            }
        System.out.println("2nd highest number : " + max2);

    }
}
