package org.example.classwork;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{11,4,2,1,5,10,6,3};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] array, int startPos, int endPos){ //O(n * log n)
        int leftPos = startPos;
        int rightPos = endPos;
        int center = array[(startPos + endPos) / 2];
        do{
            while (array[leftPos] < center){
                leftPos++;
            }
            while (array[rightPos] > center){
                rightPos--;
            }
            if (leftPos <= rightPos){
                if (leftPos < rightPos){
                    int temp = array[leftPos];
                    array[leftPos] = array[rightPos];
                    array[rightPos] = temp;
                }
                leftPos++;
                rightPos--;
            }
        }while(leftPos <= rightPos);
        if (leftPos < endPos){
            sort(array, leftPos, endPos);
        }
        if (startPos < rightPos){
            sort(array, startPos, rightPos);
        }
    }
}
