package FlowOfProgram_02.Questions;

import java.util.Scanner;

public class ComputeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        int totalSalary = computeSalary(salary);
        System.out.println(totalSalary);
    }

    static int computeSalary(int amount){
        if(amount > 10000){
            amount = amount + 2000;
        }
        else{
            amount = amount + 1000;
        }
        return amount;
    }
}
