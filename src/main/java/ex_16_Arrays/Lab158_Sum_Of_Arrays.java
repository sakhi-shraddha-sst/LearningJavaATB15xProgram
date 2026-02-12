package ex_16_Arrays;

public class Lab158_Sum_Of_Arrays {
    public static void main(String[] args) {
        int[] numbers = {34, 56, 25};

        int sum = 0;

//        for(int number : numbers){
//            sum = sum + number;
//        }

        for(int i = 0; i<=numbers.length-1; i++){
            sum = sum + numbers[i];
        }
        System.out.println("Sum of the array: " + sum);
    }
}
