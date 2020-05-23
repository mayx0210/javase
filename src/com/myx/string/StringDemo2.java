package com.myx.string;


/*
* 获取一个字符串在另一个字符串中出现的次数。
  比如：获取“ab”在 “abkkcadkabkebfkaabkskab” 中出现的次数
* */
public class StringDemo2 {
    public static int getCount(String mainStr, String subStr) {
        int mLength = mainStr.length();
        int sLength = subStr.length();

        int count = 0;
        int index ;
        if (mLength >= sLength) {
            while ((index = mainStr.indexOf(subStr))!= -1) {
                count ++;
                mainStr = mainStr.substring(index + subStr.length());

            }

           /* while ((index = mainStr.indexOf(subStr, index)) != -1) {
                count ++;
                index += subStr.length();
            }*/
            return count;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abkkcadkabkebfkaabkskab", "ab"));
    }
}
