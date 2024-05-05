package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //variable myIntArray stores a reference, means an address to the object in memory, but not the object itself.
        //the myIntArray stores an address or reference to an array in memory
        //the new keyword is creating a new object in memory, in this case an array data structure of length 5 and the myIntArray variable is storing the reference/address to that object
        int[] myIntArray = new int[5];
        //here we are storing the same reference for the same object created before on a new variable from same type int[] but not creating a new one
        int[] anotherArray = myIntArray;
        //both variables are referencing the same array in memory, so there's only one copy of the array
        //references types represent the address of the variable, rather than the data itself

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        System.out.println(myIntArray);
        System.out.println(anotherArray);

        anotherArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));



    }

    private static void modifyArray(int[] array) {
        array[1] = 2;
    }


}
