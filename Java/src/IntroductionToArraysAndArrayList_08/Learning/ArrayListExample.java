package IntroductionToArraysAndArrayList_08.Learning;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Syntax
        ArrayList <Integer> list = new ArrayList<>(5);

        /*
        list.add(45);
        list.add(365);
        list.add(234);
        list.add(476);
        list.add(8);
        list.add(354);

        System.out.println(list);

        System.out.println(list.contains(32));

        System.out.println(list.set(0,99));

        System.out.println(list.remove(2));
        System.out.println(list);
        */

//        input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

//        get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));   //pass index here, list[index] syntax will not work here
        }

    }

}

