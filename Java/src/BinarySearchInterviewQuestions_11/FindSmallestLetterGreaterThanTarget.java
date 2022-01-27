package BinarySearchInterviewQuestions_11;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

// Exact same code of Ceiling of a number
// return start % length of array for wrap letters around

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args){
        char[] alphabets = {'c','f','j'};
        char target = 'a';
        char answer = SearchLetter(alphabets,target);
        System.out.println(answer);
    }
    static char SearchLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;
            if(target < letters[middle]){
                end = middle - 1;
            }else{
                start = middle + 1;
            }
        }
        return letters[start % letters.length];
    }
}
