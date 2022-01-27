package BinarySearchInterviewQuestions_11;

public class FindPositionOfAElementInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findingAnswer(arr,target));
    }
    static int findingAnswer(int[] nums, int target){
//        first find the range
//        first start with a box of size 2
        int start = 0;
        int end = 1;

//        condition for the target to lie in the range
        while(target > nums[end]){
            int newStart = end + 1;     // this is the next newStart position
//            double the box value
//            end = previous end + sizeof box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearchFindTarget(nums,target,start,end);
    }
    static int binarySearchFindTarget(int[] arr, int target, int start, int end){
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
