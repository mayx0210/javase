package com.myx.array.sort;

import java.util.Arrays;

/*
* 冒泡排序法
* */
public class BubbleSort {
    public static void main(String[] args) {
        //定义一个数组
       int[] arr = new int[]{23,132,56,33,78,56,98,22};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"\t");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));


    }
}
