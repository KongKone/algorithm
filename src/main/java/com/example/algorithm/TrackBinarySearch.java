package com.example.algorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Mr.Mai
 * @version 2.0
 * @date 2021/9/1 0001 15:54
 */
public class TrackBinarySearch {

    public static void main(String[] args) {
        int[] a = {877,12,3,132,3,123,11,3,123,1,23,75,76,7,8645,2,456,3
                ,6378,64,56,486,4,864,86,786,4,63,231,378,6,96,78,645,123,5,7,46,58,9,3,1};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                int swap;
                if (a[j] > a[j+1]) {
                    swap = a[j];
                    a[j] = a[j+1];
                    a[j+1] = swap;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(rank(0,a.length-1, a, 3,0));
    }

    public static int rank(int lo, int hi, int[] a, int key, int depth){
       System.out.println(depth++);
       if (lo > hi) return -1;
       int mid = (hi - lo) / 2 + lo;
       if (key < a[mid]) rank(lo, mid-1, a, key, depth);
       else if (key > a[mid]) rank(mid+1, hi, a, key, depth);
       else return mid;
       return 123123123;//删
    }


}
