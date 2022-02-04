package BinarySearchInTwoDArrays_12.Questions;

import java.util.Arrays;

public class BinarySearchRolColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 49;
        System.out.println(Arrays.toString(findRowColPosition(arr,target)));
    }
    static int[] findRowColPosition(int[][]matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0){
            if(target == matrix[row][col]){
                return new int[] {row, col};
            }
            if(target > matrix[row][col]){
                row++;
            }else if(target < matrix[row][col]){
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}
