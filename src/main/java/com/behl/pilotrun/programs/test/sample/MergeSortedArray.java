package com.behl.pilotrun.programs.test.sample;

import java.util.Arrays;

public class MergeSortedArray {


    public static void main(String[] args) {

        int [] arr = new int[3];

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int [] arr = new int[m + n];

        if (m >= 0) System.arraycopy(nums1, 0, arr, 0, m);

        if (n >= 0) System.arraycopy(nums2, 0, arr, 0, n);

        for (int i = 0 ; i< arr.length - 1 ; i ++) {
            if (arr[i] > arr[i + 1]) {

                // Swapping the elements.
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                i = -1;
            } }

        System.out.println(Arrays.toString(arr));
    }
}
