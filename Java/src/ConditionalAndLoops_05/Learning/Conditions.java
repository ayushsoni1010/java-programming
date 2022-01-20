package ConditionalAndLoops_05.Learning;

public class Conditions {
    public static void main(String[] args) {
        /*
            Syntax of if statements
            if(boolean expression T or F){
                //body
            } else {
                //do this
            }
        */


        int salary = 25000;
        if(salary > 10000){
            salary = salary + 2000;
        }
        else{
            salary = salary + 1000;
        }

        System.out.println(salary);


        /*
            Syntex for For Loop

            for(initialisation; condition; increment/decrement){
                //body
            }


            Syntax of while Loop

            while(condition){
                //body
            }
        */
    }
}
