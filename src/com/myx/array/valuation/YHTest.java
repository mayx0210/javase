package com.myx.array.valuation;




/*
* 使用二维数组打印一个10行杨辉三角
*
* 提示：
* 1. 第一行1个元素，第n行有n个元素
* 2. 每一行的第一个元素和最后一个元素都是1
* 3.从第3行开始。yh[i][j] = yh[i -1][j - 1] + yh[i-1][j]
* * */
public class YHTest {
    public static void main(String[] args) {

        //声明并初始化一个二维数组
        int [][] yh = new int[10][];

        //给数组元素赋值
        for (int i = 0; i < yh.length; i++) {
            yh[i] = new int[i + 1];

            yh[i][0] = yh[i][i] = 1;

            for (int j = 1; j < yh[i].length - 1; j++) {
                yh[i][j] = yh[i -1][j - 1] + yh[i-1][j];
            }
        }

        //遍历二维数组
        for (int i = 0; i < yh.length; i++) {
            for (int k = 0; k < yh.length - yh[i].length; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yh[i].length; j++) {
                System.out.print(yh[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
