package FunctionsOrMethods_07.Learning;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
//        When we create a method that takes a variable number of arguments it is known as Variable Arguments (VarArgs)
//        When we do not know how many inputs we are giving

        fun(2,4,6,873,54,676,34,676,745,8);

        multiple(2,3,"Ayush", "Chinu", "Soniji");
    }
    //  variable length arguments are always comes at the end
    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
//        For multiple
    }

    static void fun(int ...v){
//        ...v = It is internally taking a array of integers
        System.out.println(Arrays.toString(v));
//        This are called variable length arguments
    }


}
