package ex_16_Arrays;

public class Lab151_Arrays {
    public static void main(String[] args) {
        int a = 10;

        int marks[] = {90, 80, 70, 60, 50};
        int[] marks2 = {95, 85, 75, 65, 55};

        boolean [] isMarreied = {true, true, false};
        String [] names = {"sakhi", "mali", "sahil"};
// Not allowed  String [] names1 = {"sakhi", "mali", "sahil", 32};

        float[] values = new float[3];
        values[0] = 1.5f;
        values[1] = 2.5f;
        values[2] =  3.5f;
//        values[3] = 4.5f; // ArrayIndexOutOfBoundsException

        for(String name : names){
            System.out.println(name);
        }

    }
}
