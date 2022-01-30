package BinarySearchInterviewQuestions_11.Learning;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9,10,12};
//        As array is sorted, so we use Binary Search
//        after one rotation
//        arr = {12,2,4,5,6,7,8,9,10};

//        after two rotation
//        arr = {10,12,,2,4,5,6,7,8,9};

//        Now Find the pivot in the array
//        Pivot => from where your next numbers are ascending in nature
//        let's take an example of array
//        arr = [3,4,5,6,7,   0,1,2]
//          array asc   Pivot   array asc

//        **KeyPoints**
//        --Find Pivot
//        --Search in first half => Simple binary search (start: 0, pivot: value)
//        --Otherwise, Search in second half => Simple binary search (pivot: value+1 , end: value)

//        Question: Find Pivot in rotated binary search
//        Answer:
//        -->Case1: When we find the that arr[middle] > arr[middle + 1], that is we get pivot.
//        -->Case2: if middle element  < (middle - 1) element, that is also pivot.
//                    answer => pivot = middle-1
//        -->Case3: if middle element <= start element, so in this case, all elements from middle will be smaller or less than start element
//                   hence we can ignore all these elements since we are looking for peak that is largest element.
//                   answer => end = middle-1;
//        -->Case4: if middle element >= start element, so in this case, all elements before middle will be smaller or less than middle element
//                   hence we can ignore all these elements since we are looking for peak that is largest element.
//              also, if this way like middle is pivot then it would have been returned in Case1 && Case2.
//                    hence proved, that bigger numbers lie ahead.
//                    hence ignore middle && put this thing given below
//                   answer => start = middle+1;

//        Now, we have find the pivot, let's go with searching in rotated sorted array, there will be three cases, when we are trying to search by target element
//                    arr = [3,4,5,6,7,0,1,2];
//        --> Case1: if pivot element == target element, this is the answer
//        --> Case2: if target > start element ,then search for target element, for example 6,
//                                Now, Search space => (start, pivot-1)
//        --> Case3: if target < start element , that is, we know that all elements  from start upto pivot are the going to be bigger than target, then
//                               Now, Search space => (pivot+1, end)
    }
}
