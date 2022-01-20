package SwitchStatementsAndNesting_06.Learning;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

//        switch (fruit){
//            case "Mango":
//                System.out.println("King of Fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round Fruit");
//                break;
//            case "Grapes":
//                System.out.println("Small Fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//        }


        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round Fruit");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("Please enter a valid fruit");
        }


        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }


        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }



//        Nested Switch
        int empId = input.nextInt();
        String department = input.next();

        switch (empId) {
            case 1 -> System.out.println("Ayush Soni");
            case 2 -> System.out.println("Chinu Soni");
            case 3 -> {
                System.out.println("Employee Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department entered");
                }
            }
            default -> System.out.println("Enter the correct employee id");
        }
    }
}

