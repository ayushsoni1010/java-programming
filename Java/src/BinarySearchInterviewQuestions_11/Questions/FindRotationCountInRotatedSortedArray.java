package BinarySearchInterviewQuestions_11.Questions;

public class FindRotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] num = {4,5,6,7,0,1,2};
        int answer = getRotationCountOfArray(num);
        int answerWithDuplicates = getRotationCountOfArrayWithDuplicates(num);
        System.out.println(answer);
        System.out.println(answerWithDuplicates);
    }

    static int getRotationCountOfArray(int[] arr){
        int pivot = findPivotRotatedArray(arr);
        return pivot + 1;
    }

    static int getRotationCountOfArrayWithDuplicates(int[] arr){
        int pivot = findPivotRotatedArrayWithDuplicates(arr);
        return pivot + 1;
    }

//  Use this for non-duplicates
    static int findPivotRotatedArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;
            if(middle < end && arr[middle] > arr[middle + 1]){
                return middle;
            }
            if(middle > start && arr[middle] < arr[middle - 1]){
                return middle - 1;
            }
            if(arr[middle] <= start){
                end = middle - 1;
            }else {
                start = middle + 1;
            }
        }
        return -1;
    }

    static int findPivotRotatedArrayWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int middle = start + (end - start) / 2;
            if(middle < end && arr[middle] > arr[middle + 1]){
                return middle;
            }
            if(middle > start && arr[middle] < arr[middle - 1]){
                return middle - 1;
            }
            if(arr[middle] == arr[start] && arr[middle] == arr[end]){
                if(arr[start] < arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            else if(arr[middle] < arr[start] || (arr[middle] == arr[start] && arr[middle] > arr[end])){
                start = middle + 1;
            }
            else{
                end = middle - 1;
            }
        }
        return -1;
    }
}
