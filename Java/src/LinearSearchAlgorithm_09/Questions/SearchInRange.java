package LinearSearchAlgorithm_09.Questions;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,34,3,-4,14,39};
        int target = 34;

        System.out.println(linearSearch(arr, 1, 4,target));
    }
    static int linearSearch(int[] num, int start , int end , int target){
        if(num.length == 0){
            return -1;
        }
        for (int index = start; index < end; index++) {
            int element = num[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
