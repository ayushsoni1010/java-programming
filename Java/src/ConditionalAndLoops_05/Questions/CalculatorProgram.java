package ConditionalAndLoops_05.Questions;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int answer = 0;
        while(true){
//            Take the operator as input
            System.out.print("Enter the operator : ");
            char operator = input.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                System.out.println("Please enter the num1 and num2: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                System.out.println();

                if(operator == '+'){
                    answer = num1 + num2;
                }
                if(operator == '-'){
                    answer = num1 - num2;
                }
                if(operator == '*'){
                    answer = num1 * num2;
                }
                if(operator == '/'){
                    if(num2 != 0){
                        answer = num1 / num2;
                    }
                }
                if(operator == '%') {
                    answer = num1 + num2;
                }
            }
            else if(operator == 'x' || operator == 'X'){
                break;
            } else{
                System.out.println("Invalid opeation!!!");
            }

            System.out.println(answer);
        }
    }
}
