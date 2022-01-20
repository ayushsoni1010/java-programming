package ConditionalAndLoops_05.Questions;

import java.util.Scanner;

public class AlphabetCaseChecking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);
//        trim() => it means removing the extra spaces that are at the end of these words
//        System.out.println(input.next());

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        }else
            System.out.println("UpperCase");
    }
}

