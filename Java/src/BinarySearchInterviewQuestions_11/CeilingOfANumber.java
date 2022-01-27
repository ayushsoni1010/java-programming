package BinarySearchInterviewQuestions_11;

public class CeilingOfANumber {
    public static void main(String[] args){
        int[] num = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = CeilingNumber(num, target);
        System.out.println(ans);
    }
//        cerling of a number: smallest number >= target
//    return the index of smallest number which is greater than or equal to target
    static int CeilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

//        but what if the target is greater than the greatest number in the array
//        if(target > arr.length){
//            return -1;
//        }

        while(start <= end){
//            find middle element
            int middle = start + (end - start) / 2;
            if(target > arr[arr.length - 1]){
                return -1;
            }

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
//        end -> Target <- start
//        condition for while loop violated
//        start <= end  ==> when while loop breaks
//                            start = end + 1
//        next big number, when no answer found = start
        return start;
    }
}
