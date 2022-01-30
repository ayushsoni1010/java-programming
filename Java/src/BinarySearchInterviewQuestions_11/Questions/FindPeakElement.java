package BinarySearchInterviewQuestions_11.Questions;

//https://leetcode.com/problems/find-peak-element/

//162. Find Peak Element

public class            FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }
    static int findPeakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int middle = start + (end - start) / 2;
            if(arr[middle] > arr[middle + 1]){
                end = middle;
            }
            else {
                start = middle + 1;
            }
        }
        return start;
    }
}
