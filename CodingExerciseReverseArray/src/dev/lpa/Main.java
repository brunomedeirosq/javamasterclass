package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5};
        reverse(array);
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

}
