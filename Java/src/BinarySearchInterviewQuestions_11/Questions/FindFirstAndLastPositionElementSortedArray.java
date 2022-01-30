package BinarySearchInterviewQuestions_11.Questions;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

//34. Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

public class FindFirstAndLastPositionElementSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] answer = {-1,-1};
        answer[0] = searchPosition(nums, target, true);

        if(answer[0] != -1){
            answer[1] = searchPosition(nums, target, false);
        }
        System.out.println(Arrays.toString(answer));
    }
    static int searchPosition(int[] arr, int target, boolean isFirstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target < arr[middle]){
                end = middle - 1;
            }
            else if(target > arr[middle]){
                start = middle + 1;
            }
            else{
                ans = middle;
                if(isFirstIndex){
                    end = middle - 1;
                }
                else{
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}
