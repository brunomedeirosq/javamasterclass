package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findMin(readElements(readInteger()));
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer:");
        int elements = Integer.parseInt(scanner.nextLine());
        return elements;
    }

    private static int[] readElements(int length) {
        System.out.println("Insert " + length + " integers:");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i]=Integer.parseInt(scanner.nextLine());
        }
        return array;
    }

    private static int findMin(int[] array) {
        Arrays.sort(array);
        System.out.println("The minimum integer in the array is " + array[0]);
        return array[0];
    }

}
