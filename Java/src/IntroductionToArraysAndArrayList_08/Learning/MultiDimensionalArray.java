package IntroductionToArraysAndArrayList_08.Learning;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
                1 2 3
                4 5 6
                7 8 9
        */

        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][3];

//        int[][] arr2D = {
//                {1,2,3},       //0th Index
//                {4,5,6},        //1st Index
//                {7,8,9}       //2nd Index -> arr2D [2] = {6,7,8,9}
//        };


//       2D Array Input
        int[][] arr = new int[3][2];
        System.out.println(arr.length);      //no of rows

//        input array
        for (int row = 0; row < arr.length; row++) {
//            for each col in every row
            for (int col = 0; col < arr[row].length ; col++) {
                arr[row][col] = in.nextInt();
            }
        }

//        output array
        for (int row = 0; row < arr.length; row++) {
//            for each col in every row
            for (int col = 0; col < arr[row].length ; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }


//        ENHANCED FOR LOOP
        for (int[] ints : arr) {
//            for each col in every row
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
