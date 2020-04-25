package com.Popa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = {1, 15, 20};
        System.out.println("First array: " + Arrays.toString(firstArray));

        int[] secondArray = Arrays.copyOf(firstArray, 3);
        System.out.println("Second array: " + Arrays.toString(secondArray));
    }
}
