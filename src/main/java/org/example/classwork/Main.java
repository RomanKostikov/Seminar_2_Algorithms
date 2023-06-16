package org.example.classwork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/*
task1: оценка скорости алгоритма
task2: Бинарный поиск
 */
public class Main {
    public static void main(String[] args) {
        // Random rd = new Random();
        task2();
    }

    public static void task1() {
        for (int i = 10000; i < 100000; i = i + 10000) {
            int[] array = new int[i];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            Date starDate = new Date();
            Bubble.sort(array);
            // System.out.println(Arrays.toString(array));
            Date endDate = new Date();
            long bubbleSortTime = endDate.getTime() - starDate.getTime();
            // long [-x;x]
            // unsigned long [0;2*x]
            // long long [-y;y]
            // unsigned long long [0;2*y]
            int[] array2 = new int[i];
            for (int j = 0; j < array2.length; j++) {
                array2[j] = (int) Math.random() * 10000;
            }
            Date starDate2 = new Date();
            QuickSort.sort(array2, 0, array2.length - 1);
            Date endDate2 = new Date();
            long quickSortTime = endDate2.getTime() - starDate2.getTime();
            System.out.printf("i: %s, bubble sort: %s, quick sort: %s \n", i, bubbleSortTime, quickSortTime);
        }
    }

    public static void task2() {
        int[] array = new int[]{1, 3, 6, 7, 8, 9, 12, 17, 24};
        // for (int i = 0; i < array.length; i++) {
        //     array[i] = i;
        // }
        System.out.println(search(12, array, 0, array.length - 1));
    }

    public static int search(int value, int[] array, int min, int max) { //O(n*log n)
        int midPoint;
        if (max < min) {
            return -1;
        } else {
            midPoint = (max - min) / 2 + min;
        }
        if (array[midPoint] < value) {
            return search(value, array, midPoint + 1, max);
        } else {
            if (array[midPoint] > value) {
                return search(value, array, min, midPoint - 1);
            } else {
                return midPoint;
            }
        }
    }
}