package BinarySearchInterviewQuestions_11.Questions;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1};
        int target = 3;
        int answer = applySearch(nums, target);
        System.out.println(answer);
    }
//    Finding Peak
    static int findPeakInBitonicArray(int[] arr){
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
//        start == end
    }

    static int applySearch(int[] arr,int target){
        int peak = findPeakInBitonicArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0 ,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){
        boolean isAscending = arr[start] < arr[end];
        while(start < end){
            int middle = start + (end - start) / 2;
            if(arr[middle] == target){
                return middle;
            }
            if(isAscending){
                if(target < arr[middle]){
                    end = middle - 1;
                }
                else{
                    start = middle + 1;
                }
            }
            else{
                if(target > arr[middle]){
                    end = middle - 1;
                }
                else{
                    start = middle + 1;
                }
            }
        }
        return -1;
    }

}
