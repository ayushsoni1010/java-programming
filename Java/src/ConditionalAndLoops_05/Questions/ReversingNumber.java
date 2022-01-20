package ConditionalAndLoops_05.Questions;

public class ReversingNumber {
    public static void main(String[] args) {

//        Q: Reversing the given number

        int number = 2346346;
        int remainder = 0;
        int temp = 0;
        while(number > 0){
            remainder = number % 10;
            number = number / 10;
            temp = temp * 10 + remainder;
        }
        System.out.println(temp);
    }
}
