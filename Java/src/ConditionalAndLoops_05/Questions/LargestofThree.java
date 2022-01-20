package ConditionalAndLoops_05.Questions;

import java.util.Scanner;

public class LargestofThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        Q: Find the largest of the numbers 3

//        int max = a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }

//        System.out.println(max);

//        int max = 0;
//        if(a > b){
//            max = a;
//        }
//        else{
//            max = b;
//        }
//        if( c > max){
//            max = c;
//        }
//        System.out.println(max);

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}