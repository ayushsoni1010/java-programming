package ConditionalAndLoops_05.Questions;

import java.util.Scanner;

public class FindFibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int previous = 0;
        int currentIndex = 1;
        int count = 2;

        while(count <= n){
            int temp = currentIndex;
            currentIndex = currentIndex + previous;
            previous = temp;
            count ++;
        }

        System.out.println(currentIndex);;
    }
}

