package com.myx.array.valuation;


/*
* 定义一个int型的一维数组，包含10个元素，分别赋给一些随机整数，
* 然后求出所有的最大值，最小值，和值，平均值，并输出。
* 要求：所有随机数都是两位数
* arr[i] = (int) (Math.random()*（99 - 10 +1） + 10);   [10,99]
* */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*90 + 10);
        }


        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
        System.out.println("-----------------");

        int max = arr[0];
        //求最大值
        for (int i = 1; i < arr.length; i++) {
            //System.out.print(arr[i] + "\t");
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);

        //求最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);

        //求和与平均值
        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = sum / arr.length;

        }
        System.out.println(sum);
        System.out.println(average);
    }
}

