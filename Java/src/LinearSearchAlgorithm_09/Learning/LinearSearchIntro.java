package LinearSearchAlgorithm_09.Learning;

public class LinearSearchIntro {
        public static void main(String[] args) {
            int[] nums = {2, 34, 4, 54, 7, 84, 67};
            int target = 54;
            int ans = linearSearch1(nums, target);
            System.out.println(ans);
        }

        //    search the target and return ture or false
        static boolean linearSearch3(int[] arr, int target) {
            if (arr.length == 0) {
                return false;
            }

            //        run a for loop
            for (int element : arr) {
                //            check for element at every index if it is = target
                if (element == target) {
                    return true;
                }
            }
            //        this line will execute if none of the return statements above have executed hence the target not found
            return false;
        }


        //    Search the target and return the element
        static int linearSearch2(int[] arr, int target) {
            if (arr.length == 0) {
                return -1;
            }

//        run a for loop
            for (int element : arr) {
//            check for element at every index if it is = target
                if (element == target) {
                    return element;
                }
            }
//        this line will execute if none of the return statements above have executed hence the target not found
            return -1;
        }

        //    Search in the array: return the index if item found
//    otherwise if item not found return -1
        static int linearSearch1(int[] arr, int target) {
            if (arr.length == 0) {
                return -1;
            }

//        run a for loop
            for (int i = 0; i < arr.length; i++) {
//            check for element at every index if it is = target
                int element = arr[i];
                if (element == target) {
                    return i;
                }
            }
//        this line will execute if none of the return statements above have executed hence the target not found
            return -1;
        }
}

