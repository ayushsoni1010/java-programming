package ConditionalAndLoops_05.Questions;

public class CountRepetitionNumber {
    public static void main(String[] args) {

//        Q: Count the repetition number

        int num = 4553657;
        int count = 0;
        while(num > 0){
            int remainder = num % 10;
            if(remainder == 5){
                count ++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}

