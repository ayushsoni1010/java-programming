package com;

//https://leetcode.com/problems/richest-customer-wealth/

//1672. Richest Customer Wealth

public class ComputeMaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,2}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int [][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int[] arr: accounts){
            int sum = 0;
            for(int element: arr){
                sum += element;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
