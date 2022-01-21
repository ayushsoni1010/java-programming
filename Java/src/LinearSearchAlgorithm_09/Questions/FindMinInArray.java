package LinearSearchAlgorithm_09.Questions;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr = {18,12,34,3,-4,14,39};
        System.out.println(findMinimum(arr));
    }
    static int findMinimum(int[] num){
        int ans = num[0];

        for (int i = 1; i < num.length; i++) {
            if(num[i] < ans){
                ans = num[i];
            }
        }
        return ans;
    }
}

