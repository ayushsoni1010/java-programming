package FunctionsOrMethods_07.Questions;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean answer = isPrime(number);
        System.out.println(answer);
    }

    static boolean isPrime(int num) {
        int c = 2;
        if(num <= 1){
            return false;
        }
        while(c * c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}
