package FunctionsOrMethods_07.Questions;
//        Q: Print all the  3 digits armstrong numbers

//        So, if a = 153;
//        then sqaure of 1 + square of 5 + square of 3 = a (that is the number)
//        then it is called armstrong number

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        isArmstrong(num);
    }

    static void isArmstrong(int num) {
        int remainder = 0 , cube = 0, sum = 0;
        int original_number = num;
        while(num > 0){
            remainder = num % 10;
            cube = remainder * remainder * remainder;
            sum += cube;
            num = num / 10;
        }

        if(sum == original_number){
            System.out.println("It is a Armstrong number");
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}

