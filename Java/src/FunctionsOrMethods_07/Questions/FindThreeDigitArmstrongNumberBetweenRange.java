package FunctionsOrMethods_07.Questions;

import java.util.Scanner;

public class FindThreeDigitArmstrongNumberBetweenRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start_range = input.nextInt();
        int end_range = input.nextInt();
        computeArmstrongNumber(start_range,end_range);
    }
    static boolean isArmstrong(int num) {
        int remainder = 0 , cube = 0, sum = 0;
        int original_number = num;
        while(num > 0){
            remainder = num % 10;
            cube = remainder * remainder * remainder;
            sum += cube;
            num = num / 10;
        }
        return sum == original_number;
    }

    static void computeArmstrongNumber(int start, int end){
        for (int i = start; i < end; i++) {
            if(isArmstrong(i)){
                System.out.print(i + "  ");
            }
        }
    }
}
