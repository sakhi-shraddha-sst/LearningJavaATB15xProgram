package ex_10_For_Loop;

public class Lab110_Odd_Even_From_Top50 {
    // TO find the even numbers from 1 to 50
    public static void main(String[] args) {
        for(int i = 1; i<=50; i++){
            if(i%2==0){
                System.out.println("Even => " + i);
            }else if(i%2!=0){
                System.out.println("Odd => " + i);
            }
        }
    }
}

// 5th Jan 2026
