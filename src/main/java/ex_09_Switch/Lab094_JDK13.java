package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}

// JDK 13 introduced the ability to group multiple case labels together using commas in a traditional switch statement,
// allowing multiple cases to execute the same block of code without needing to repeat the code for each case.

