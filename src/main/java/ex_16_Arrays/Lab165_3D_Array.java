package ex_16_Arrays;

public class Lab165_3D_Array {
    public static void main(String[] args) {
        int[][][] arr3D = {
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {7,8,9},
                        {10,11,12}
                }
        };
        System.out.println("Element at arr3D[1][0][2]: " + arr3D[1][0][2]); // Output: 9
    }
}
