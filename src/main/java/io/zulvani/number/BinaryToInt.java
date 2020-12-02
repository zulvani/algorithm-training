package io.zulvani.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryToInt {

    public BinaryToInt(int[] arr) {
    }

    public BinaryToInt(String S) {
//        int n = Integer.parseInt(S, 2);
//        System.out.println(n);

        int l = S.length() - 1;
        int r = 0;
        for(int i = 0; i < S.length(); i++){
            int digit = Integer.parseInt(S.substring(i, i + 1));
            r += digit * Math.pow(2, l);
            l--;
        }
//
        System.out.println("r" + r);
//
//        int counter = 0;
//        while(n > 0){
//            if(n % 2 == 0){
//                n = n / 2;
//            } else {
//                n = n - 1;
//            }
//            counter++;
//        }
//
//        System.out.println(counter);

//        int x = Integer.parseInt(S);
//        System.out.println(toDecimal(x, S));
    }

    static int toDecimal(int n, String S) {

        int result = 0;
        int power = 1;

//        for(int i = 0; i < S.length(); i++){
//            int digit = Integer.parseInt(S.substring(i, i + 1));
//            result += digit * power;
//            power = power * 2;
//        }

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            System.out.println("n:" + n);

            result += digit * power;

            power = power * 2;
        }

        System.out.println("pangkat: " + Math.pow(2, 0));

        return result;
    }

    public static void main(String[] args){
//        String s = "";
//        new BinaryToInt(s);

        int A[] = new int[]{10, 0, 8, 2, -1, 12, 11, 3};
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i = 0; i < A.length; i++){
            if(A[i] >= 0){
                right.add(A[i]);
            } else if(A[i] < 0) {
                left.add(A[i]);
            }
        }


        Collections.sort(left);
        Collections.sort(right);

        left.addAll(right);

        int diffMax = 0;
        for(int i = 0; i < left.size() - 1; i++){
            int d = left.get(i + 1) - left.get(i);
            if(d > diffMax){
                diffMax = d;
            }
        }



//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(range);
//        System.out.println(left.size());
//        System.out.println(right.size());
    }
}
