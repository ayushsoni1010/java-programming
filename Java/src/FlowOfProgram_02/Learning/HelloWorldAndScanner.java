package FlowOfProgram_02.Learning;

import java.util.Scanner;

public class HelloWorldAndScanner {

    public static void main(String[] args){
//        System.out.println("Hello World");
//        System.out.print("My name is Ayush");
//        System.out.print("Soni");

        Scanner input = new Scanner(System.in);
//        input.nextInt();
        System.out.println(input.nextInt());

        System.out.println(input.next());
        System.out.println("Hey Man!");
        System.out.println(input.nextLine());
    }
}
