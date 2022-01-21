package com;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

//1295. Find Numbers with Even Number of Digits

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] num={12,345,2,6,7896};
        System.out.println(digits(-42344));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }
}


