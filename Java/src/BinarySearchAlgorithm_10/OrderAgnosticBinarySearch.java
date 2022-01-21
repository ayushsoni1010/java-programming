package BinarySearchAlgorithm_10;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = orderAgnosticBS(arr ,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

//        Find whether the array is sorted in ascending or descending
        boolean isAsc;
        isAsc = arr[start] < arr[end];

        while(start <= end){
            int middle = start + (end - start) / 2;

            if(arr[middle] == target){
                return middle;
            }
            if(isAsc){
                if(target < arr[middle]){
                    end = middle - 1;
                }
                else if(target > arr [middle]){
                    start = middle + 1;
                }
            }
            else{
                if(target > arr[middle]){
                    end = middle - 1;
                }
                if(target > arr [middle]){
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
