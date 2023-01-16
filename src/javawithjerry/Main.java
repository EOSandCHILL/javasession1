package javawithjerry;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;
//        System.out.println(Arrays.toString(numbers));

//        int[] numbers = {1,4,5,2,3};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

        // Multi-dimensional Arrays
        int[][] numbers = new int[2][3]; // Creating a 2x3 array (two rows, three columns)
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 1;
        numbers[1][1] = 2;
        numbers[1][2] = 3;
        System.out.println(Arrays.deepToString(numbers));
    }
}