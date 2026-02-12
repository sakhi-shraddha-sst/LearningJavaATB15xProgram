package task;

public class Jan16_2nd_Highest_Number {
    public static void main(String[] args) {
        // Find out the 2nd highest number in the array
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32}; // 100, 34

        int highest = 0;
        int second_highest = 0;

        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] > highest) {
                second_highest = highest;
                highest = numbers[i];
            }
            else if(numbers[i] > second_highest && numbers[i] != highest){
                second_highest = numbers[i];
            }
        }
        System.out.println("Highest number : " + highest);

        System.out.println("2nd highest number : " + second_highest);

    }
}
