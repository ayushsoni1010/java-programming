package LinearSearchAlgorithm_09.Questions;

public class ComputeMaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,2}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int [][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int[] arr: accounts){
            int sum = 0;
            for(int element: arr){
                sum += element;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
