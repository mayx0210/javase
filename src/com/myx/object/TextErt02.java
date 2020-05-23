package com.myx.object;

import java.util.Scanner;

public class TextErt02 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = 0;//记录正数的个数12

		int y = 0;//记录负数的个数

		for (; ; ) {
			System.out.println("请输入一个数：");
			int num = in.nextInt();
			if (num > 0) {
				x++;
			} else if (num < 0) {
				y++;
			} else {
				break;
			}
		}

		System.out.println("正数的个数为：" + x + "个");
		System.out.println("负数的个数为：" + y + "个");
	}

}