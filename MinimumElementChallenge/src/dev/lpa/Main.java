package dev.lpa;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        findMin(readIntegers());
        reverseArray(readIntegers());


    }

    private static int[] readIntegers() {
        System.out.println("Insert comma delimited list of integer numbers:");
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(",");
        System.out.println(Arrays.toString(array));
        int[] arrayOfIntegers = new int[array.length];
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = Integer.parseInt(array[i].trim());
        }
        return arrayOfIntegers;
    }

    private static int findMin(int... args) {
        Arrays.sort(args);
        System.out.println(args[0]);
        return args[0];
    }

    private static void reverseArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
            System.out.println(Arrays.toString(array));
        }
    }


}
