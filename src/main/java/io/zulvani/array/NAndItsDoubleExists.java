package io.zulvani.array;

/**
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M
 *
 * Example 1:
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 *
 * Input: arr = [7,1,14,11]
 * Output: true
 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
 *
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 *
 */
public class NAndItsDoubleExists {

    public NAndItsDoubleExists() {
        int[] arr = new int[]{10,2,5,3};
//        int[] n = new int[]{3,1,7,11};

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] * 2 == arr[i] && i != j) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println(found);
    }

    public static void main(String[] args){
        new NAndItsDoubleExists();
    }
}
