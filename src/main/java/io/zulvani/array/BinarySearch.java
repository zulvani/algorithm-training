package io.zulvani.array;

public class BinarySearch {

    public BinarySearch(int[] arr, int search) {
        System.out.println(found(arr, 0, arr.length, search));
    }

    private boolean found(int[] arr, int start, int end, int search){
        int mid = start + (int) Math.ceil((end - start) / 2);
        System.out.println("median:" + mid + " [" + start + "," + end + "]");
        if(start < end) {
            if (arr[mid] == search) {
                return true;
            }

            if(search > arr[mid])
                return found(arr, mid + 1, end, search);

            return found(arr, start, mid, search);
        }
        return false;
    }

    public static void main(String[] args){
        int arr[] = new int[]{ 1, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 15, 17};
        //                     0  1  2  3  4  5  6  7    8   9  10  11  12
        System.out.println("length of array = " + arr.length);
        new BinarySearch(arr, 14);
    }
}
