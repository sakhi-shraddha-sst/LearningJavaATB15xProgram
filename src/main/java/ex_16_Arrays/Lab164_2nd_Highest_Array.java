package ex_16_Arrays;

public class Lab164_2nd_Highest_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 34};

        int highest = 0;
        int secondhighest = 0;
        // 67
        // Loop through the array to find the highest and second highest
        for(int num : numbers){
            if(num > highest){
                secondhighest = highest;
                highest = num;
            }
            else if (num > secondhighest && num!= highest) {
                secondhighest = num;
            // {10, 5, 8};
            }

        }
        System.out.println("Second highest number in the array is: " + secondhighest);
    }
}
