package com.myx.array.sort;


import java.util.Arrays;

/*
* 快速排序
* */
public class QuickSort {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[]{23, 12, 43, 24, 89, 66, 88, 99, 454};
        subSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));


    }

    public static void subSort(int[] arr, int low, int high) {
        int pivot = arr[low];
        int l = low;
        int h = high;

        while (l < h) {
            while (arr[l] <= pivot){
                l ++;

            }
            while (arr[h] > pivot) {
                h --;
            }
            if (l >= h) {
                break;
            }

            //交换
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;

            //交换完成后，发现这个
        }

        //交换首元素和arr[h]的值
        int temp = arr[low];
        arr[low] = arr[h];
        arr[h] = temp;

        if (low < h){
            subSort(arr,low,h );//递归调用
        }
       if (high>l){
           subSort(arr,l,high);
       }

    }
}
