package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Integer boxedInt = Integer.valueOf(15);
//        Integer deprecatedBoxing = new Integer(15);
//        int unboxedInt = boxedInt.intValue();

        //Automatic
        Integer autoBoxedInt = 15;
        int autoUnboxedInt = autoBoxedInt;
        System.out.println(autoBoxedInt.getClass().getName());
//        System.out.println(autoUnboxedInt.getClass().getName());

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));
        System.out.println(characterArray.getClass().getName());

        System.out.println(returnAnInt(10));
        System.out.println(returnAnInteger(20));

        var ourList = getList(1,2,3,4,5);
        System.out.println(ourList);
        System.out.println(ourList.get(0).getClass().getName());

    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }

    private static ArrayList<Integer> getList(int... varargs){

        ArrayList<Integer> aList = new ArrayList<>();
        for (int i:varargs) {
            aList.add(i);
        }
        return aList;
    }



}
