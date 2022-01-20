package FunctionsOrMethods_07.Learning;

public class FunctionOverloading {
    public static void main(String[] args) {
//        function overloading basically happens two or more functions of the same name, they can exist if the parameters are different
        fun(67);
        fun("Ayush");

        int ans = sum(3,5);
        System.out.println(ans);

        ans = sum(3,54,6);
        System.out.println(ans);
    }

    static int sum(int a, int b ){
        return a+b ;
    }

    static int sum(int a, int b ,int c){
        return a + b + c ;
    }

    static void fun(int i) {
        System.out.println(i);
    }

    static void fun(String name){
        System.out.println(name);
    }
}

