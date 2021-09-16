package com.company;

import java.util.Arrays;

public class SelectionSort {

    public static void sort() {

        int[] array = new int[] {1, 3, 0, 15, 4};
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int index = min(array, i);

            int red = array[i];
            array[i] = array[index];
            array[index] = red;
        }
    }
    private static int min(int[] array, int i) {
        int minIndex = i;
        int minValue = array[i];
        for (int q = i+1; q < array.length; q++){
            if (array[q] < minValue){
                minValue = array[q];
                minIndex = q;
            }
        }
        return minIndex;
    }
}



