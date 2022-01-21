package LinearSearchAlgorithm_09.Questions;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] num={12,345,2,6,7896};
        System.out.println(findNumbers(num));

        System.out.println(digiits(-42344));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digiits (int num){
        if(num<0){
            num = num*-1;
        }
        return (int) Math.log10(num) + 1;
    }

    static int digits(int num){
        if(num<0){
            num = num * -1;
            return num;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}

