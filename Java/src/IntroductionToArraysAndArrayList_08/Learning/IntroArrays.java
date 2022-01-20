package IntroductionToArraysAndArrayList_08.Learning;

import java.util.Arrays;
import java.util.Scanner;

public class IntroArrays {
    public static void main(String[] args) {
//        Q: store a roll number
        int a= 19;

//        Q: store a person's name
        String name = "Ayush Soni";

//        Q: store 5 roll number
        int rno1 = 23;
        int rno2 = 43;
        int rno3 = 76;

//        syntax
//        datatype[] variable_name = new datatype[size];
//        store 5 roll numbers:
        int[] rnos = new int[5];
//        or directly
        int [] rnos1 = {23,435,63,245,7};

        int[] ros;    //declaration of array  ros is getting defined in the stack
        ros = new int[5];   //initialisation: actually here object is being created in the memory (heap)

        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);


        Scanner in = new Scanner(System.in);
//        Array of primitives
        int[] arr1 = new int [5];
        arr1[0] = 23;
        arr1[1] = 4;
        arr1[2] = 67;
        arr1[3] = 89;
        arr1[4] = 233;
//        [23, 4, 67, 89, 233]
        System.out.println(arr1[3]);

//        input using for loops
        for (int i = 0; i < arr1.length ; i++){
            arr1[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr1));

//        for (int num1 : arr){   //for every element in array, print the element
//            System.out.println(num1 + " ");   //here num represents element of the array
//        }

//        System.out.println(arr1[5]);              //index out of bound error


//        Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));


    }
}
