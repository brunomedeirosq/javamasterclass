package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println(Arrays.toString(getIntegers(5)));
        int[] array = getIntegers(5);
//        printArray(array);
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);





    }

    public static int[] getIntegers(int size) {
        System.out.println("Please insert " + size + " numbers between 0 and 1000:");
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        while (index < size) {
            try {
                int number =  Integer.parseInt(scanner.next());
                if (number >= 0 && number <= 1000) {
                    array[index] = number;
                    index++;
                } else {
                    System.out.println("Please only numbers between 0 and 1000!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please insert an integer number between 0 an 1000");
            }
        }

    return array;
    }

    public static void printArray(int[] array) {
        int index = 0;
        for (int element:
             array) {
            System.out.println("Element " + index + " contents " + element);
            index++;
        }
    }

    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[array.length-1-i];
        }
        return sortedArray;
    }


}
