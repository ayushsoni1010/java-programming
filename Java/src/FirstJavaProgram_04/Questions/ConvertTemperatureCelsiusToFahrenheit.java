package FirstJavaProgram_04.Questions;

import java.util.Scanner;

public class ConvertTemperatureCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter temperture in C: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }
}
