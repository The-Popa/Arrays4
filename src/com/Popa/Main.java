package com.Popa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] FirstArray = {1, 15, 20};
        System.out.println("First array: " + Arrays.toString(FirstArray));

        int[] SecondArray = Arrays.copyOf(FirstArray, 3);
        System.out.println("Second array: " + Arrays.toString(SecondArray));
    }
}
