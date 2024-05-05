package dev.lpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        sortArrayDescending(generateArray(10));
    }

    private static int[] generateArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i]= random.nextInt(0,50);
        }
        return array;
    }

    private static int[] sortArrayDescending(int[] array) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int[] invertArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertArray[i] = array[array.length-1-i];
        }
        System.out.println(Arrays.toString(invertArray));
        return invertArray;
    }


}
