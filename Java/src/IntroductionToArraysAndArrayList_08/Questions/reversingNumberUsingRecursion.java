package IntroductionToArraysAndArrayList_08.Questions;

public class reversingNumberUsingRecursion {
    public static void main(String[] args) {
        int number = 12345;
        int ans = ReverseNumber(number);
        System.out.println(ans);
    }
    static int ReverseNumber(int num){
        if(num < 10){
            System.out.println(num);
        }
        else{
            System.out.print(num % 10);
            ReverseNumber(num/10);
        }
        return num;
    }
}
