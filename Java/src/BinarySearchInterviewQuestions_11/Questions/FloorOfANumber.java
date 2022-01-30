package BinarySearchInterviewQuestions_11.Questions;

public class FloorOfANumber {
    public static void main(String[] args){
        int[] num = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = FloorNumber(num, target);
        System.out.println(ans);
    }

//    return the index of greatest number which is smaller than or equal to target.
    static int FloorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
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
//        end -> Target <- start
//        condition for while loop violated
//        start <= end  ==> when while loop breaks
//        before small number, when no answer found = end
        return end;
    }
}
