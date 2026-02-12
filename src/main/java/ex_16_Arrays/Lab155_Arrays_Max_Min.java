package ex_16_Arrays;

import java.util.Arrays;

public class Lab155_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array= {25, 14, 45, 67, 29, 87, 33, 99};

//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);

        int max = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("max" + max);


        int min = array[0];

        for(int i = array.length-1; i >=0; i--){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("min"  + min);


    }




}
