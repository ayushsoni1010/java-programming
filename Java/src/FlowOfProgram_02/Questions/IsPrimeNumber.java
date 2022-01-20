package FlowOfProgram_02.Questions;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        isPrime(number);
    }

    static void isPrime(int num){
        if(num <= 1){
            System.out.println("Neither Prime nor composite");
        }
        int count = 2;
        while(count * count <= num){
            if(num % count == 0){
                System.out.println("Number is not Prime");
                break;
            }
            count++;
        }
        if(count * count > num){
            System.out.println("Number is Prime");
        }
    }
}
