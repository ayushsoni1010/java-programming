package BinarySearchInterviewQuestions_11.Questions;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/

//852. Peak Index in a Mountain Array => Bitonic Array

public class FindPeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int ans = findPeakIndexInMountain(nums);
        System.out.println(ans);
    }
    static int findPeakIndexInMountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;
            if(arr[middle] > arr[middle + 1]){
//                you are in decreasing part of the array
//                this may be the potential answer, but look at left
//                this is why end != middle-1
                end = middle;
            }else{
//                you are in the ascending part of the array
                start = middle + 1;
//                because we know that middle+1 element  > middle element
            }
        }
//        in the end, start == end ,, and pointing to the largest number because of the above 2 checks
//        start and end are always trying to find the max element in the above 2 checks
//        hence when they are pointing to just one element, that is the maximum one because that is what the checks say
//        more elaboration: at every point of time for start and end, they have the best possible answer till that time
//        if we are saying that only one item is remaining, hence because of above line that is the best possible answer

        return start; // or return end ,, as both are equal to each other
//        start == end
    }
}
