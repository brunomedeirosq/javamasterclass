package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] firstArray = getRandomArray(10);
//        for (int element:
//                firstArray) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(firstArray));
//        System.out.println(Arrays.toString(getSortedArray(firstArray)));
//
//        int[] secondArray = new int[10];
//        System.out.println(Arrays.toString(secondArray));
//        Arrays.fill(secondArray,10);
//        System.out.println(Arrays.toString(secondArray));
//
//        int[] thirdArray = getRandomArray(10);
//        System.out.println(Arrays.toString(thirdArray));
//
//        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
//        System.out.println(Arrays.toString(fourthArray));
//
//        Arrays.sort(fourthArray);
//        System.out.println(Arrays.toString(thirdArray));
//        System.out.println(Arrays.toString(fourthArray));
//
//        int[] smallerArray = Arrays.copyOf(thirdArray,5);
//        System.out.println(Arrays.toString(smallerArray));
//
//        int[] largerArray = Arrays.copyOf(thirdArray,15);
//        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able","Jane","Mark","Ralph","David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5,0};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }




    }

    private static int[] getRandomArray(int len) {
        int[] myArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
//            myArray[i] = random.ints(1,10).findFirst().getAsInt();
            myArray[i] = random.nextInt(100);
        }
        return myArray;
    }

    private static int[] getSortedArray(int[] array) {
        Arrays.sort(array);
        return array;
    }


}
