package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] originalArray = new String[] {"First", "Second", "Third"};
        System.out.println(originalArray.getClass().getSimpleName());
        System.out.println(originalArray.length);

        var originalList = Arrays.asList(originalArray);
        System.out.println(originalList.getClass().getSimpleName());
        System.out.println(originalList.size());

        originalList.set(2,"Fourth");
        System.out.println(originalList);

        System.out.println(Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println(originalList);

        // originalList.remove(0); //not possible to remove elements from an array

        //to create a fixed size list from an array we can also use this approach
        List<String> newList = Arrays.asList("Sunday","Monday","Tuesday");
        System.out.println(newList);




    }


}
