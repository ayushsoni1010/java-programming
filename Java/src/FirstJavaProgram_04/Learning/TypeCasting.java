package FirstJavaProgram_04.Learning;

import java.util.Scanner;

//TYPECASTING
//The destination type should be greater than the source type
//Float > Int

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

//        Type Casting
//        int num = (int)(67.845f);
//        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b /c;
//        System.out.println(d);


//        byte a = 50;
//        a = a * 2;
//        Error will give as destination is wrong and it becomes an integer so cannot put this into byte now

//        int number1 = 'A';
//        System.out.println(number1);
//        int number2 = 'a';
//        System.out.println(number2);


//        Follows unicode
//        System.out.println("नमस्ते");

//        Rules
//        All the bytes, short and character are promoted to integer



        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c)  - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
//        float + int -double = double;
        System.out.println(result);
    }
}

