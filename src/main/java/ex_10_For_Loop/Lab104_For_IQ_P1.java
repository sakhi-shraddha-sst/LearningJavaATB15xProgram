package ex_10_For_Loop;

public class Lab104_For_IQ_P1 {
    public static void main(String[] args) {
        for (int i = 0;i>10;) {
            System.out.println("Hello");
        }
    }
}
// What is the output?
// A. Hello printed infinite times
// B. No output
// C. Compilation Error
// D. Runtime Error


// B. No output is the correct answer.
// Explanation: The loop condition i > 10 is false at the start (since i is initialized to 0),
// so the loop body never executes, resulting in no output.