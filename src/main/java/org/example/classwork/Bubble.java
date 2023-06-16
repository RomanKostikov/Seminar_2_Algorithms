package org.example.classwork;

import java.util.Arrays;

/*
Bubble
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{11,4,2,1,5,10,6,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] array){ // O(n^2)
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {// j = 8
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sort_X (int[] array){ //O(n^2)
        boolean needSort;
        do {
            needSort = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    needSort = true;
                }
            }
        }
        while (needSort);
    }
}
