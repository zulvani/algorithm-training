package io.zulvani.array;

import java.util.Arrays;

/**
 * take a look the theory here:
 * https://en.wikipedia.org/wiki/Bubble_sort
 *
 */
public class BubleSort {

    public BubleSort(int[] arr) {
        for(int i = 0; i < arr.length; ++i){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int arr[] = new int[]{ 5,1,3,4,6,8 };
        new BubleSort(arr);
    }
}
