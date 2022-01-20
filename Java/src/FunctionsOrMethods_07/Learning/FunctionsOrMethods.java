package FunctionsOrMethods_07.Learning;

import java.util.Arrays;
import java.util.Scanner;

public class FunctionsOrMethods {
    public static void main(String[] args) {
//      Calling the greet function
        String message  = greet();
        System.out.println(message);

//      Calling the sum function
        sum();
        sum2(10,20);


//        Swapping : but it will not swap values, it will not reflect change
        int a = 10;
        int b = 20;
        swap(a,b);


//        create a array
        int[] arr = {2,65,45,7,3};
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static String greet(){
        String greeting = "Hello Ayush";
        return greeting;
    }

    //  pass the value of numbers when you are calling the method in main()
    static int sum2(int a, int b){
        int sum = a + b;
        return sum;
    }


    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }

//  Syntax:
    /*
        access modifier() return_type name (arguments){
            //body
            return statement;
        }
    */


    static void swap(int x, int y){
        int temp = x;
        x = y;
        y= temp;
    }



    static void changeArray(int[] nums){
        nums[0] = 99;   /* if you make a change to the object via this reference variable, same object will be changed*/
    }
}

