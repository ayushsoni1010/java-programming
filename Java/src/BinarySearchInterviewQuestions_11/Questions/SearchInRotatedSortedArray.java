package BinarySearchInterviewQuestions_11.Questions;

//https://leetcode.com/problems/search-in-rotated-sorted-array/

//33. Search in Rotated Sorted Array

// For Distinct values without duplicate array

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
       int[] arr = {4,5,6,7,0,1,2};
       int target = 0;
       int answer = SearchInRotatedArray(arr, target);
        System.out.println(answer);
    }
//    this will not work in duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;

//          4 cases over here
            if(middle < end && arr[middle] > arr[middle + 1]){
                return middle;
            }
            if(middle > start && arr[middle] < arr[middle - 1]){
                return middle - 1;
            }
            if(arr[middle] <= arr[start]){
                end = middle -1;
            }
            else{
                start = middle + 1;
            }
        }
        return -1;
    }


    static int findPivotWithDuplicateValues(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;

//          4 cases over here
            if(middle < end && arr[middle] > arr[middle + 1]){
                return middle;
            }
            if(middle > start && arr[middle] < arr[middle - 1]){
                return middle - 1;
            }

//            if elements at middle, start, end are equal then just skip the duplicates
            if(arr[start] == arr[middle] && arr[end] == arr[middle] ){
//              skip the duplicates
//              NOTES:  what if these elements at start and end were the pivots??

//              check if start is pivot
                if(arr[start] < arr[start + 1]){
                    return start;
                }
                start++;

//              check if end is pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            else if(arr[start] > arr[middle] || (arr[start] == arr[middle] && arr[middle] > arr[end])){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return -1;
    }

    static int SearchInRotatedArray(int[] arr,int target){
        int pivot = findPivot(arr);

//        if we do not find a pivot, it means the array is not rotated
        if(pivot == -1){
//            just do normal binary search
            return binarySearchInRotatedArray(arr,target, 0,arr.length-1);
        }
//        if pivot is found, you have found 2 ascending sorted arrays
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearchInRotatedArray(arr, target, 0, pivot-1);
        }
        return binarySearchInRotatedArray(arr, target, pivot+1, arr.length-1);
    }

    static int binarySearchInRotatedArray(int[] arr, int target, int start, int end){
        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target < arr[middle]){
                end = middle - 1;
            }
            else if(target > arr[middle]){
                start = middle + 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
