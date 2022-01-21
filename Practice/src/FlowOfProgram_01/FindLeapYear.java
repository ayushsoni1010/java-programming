package FlowOfProgram_01;

import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println(isLeapYear(year));
    }

    static boolean isLeapYear(int year) {
        if(year % 4 ==0){
            if (year % 100 == 0) {
                if(year % 400 == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
