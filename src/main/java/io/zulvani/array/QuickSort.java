package io.zulvani.array;

import java.util.Arrays;

public class QuickSort {

    public QuickSort(int[] arr) {
        sort(arr, 1, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private int[] sort(int[] arr, int left, int right){
        int pivot = arr[0];

        while(left < right){
            if(arr[left] > pivot){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            } else {
                left++;
            }

            if(arr[right] <= pivot){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            } else {
                right--;
            }
        }

//        arr[0] = arr[left - 1];
//        arr[left - 1] = pivot;

//        sort(arr, 1, left);
//        sort(arr, right, arr.length -1);

        return arr;
    }

    public static void main(String[] args){
        int arr[] = new int[]{ 3,7,8,5,2,1,9,5,4 };
        new QuickSort(arr);
    }
}
