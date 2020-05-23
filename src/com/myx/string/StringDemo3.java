package com.myx.string;


/*
* 获取两个字符串中最大相同子串。比如：
   str1 = "abcwerthelloyuiodefabcdef";str2 = "cvhellobnm"
   提示：将短的那个串进行长度依次递减的子串与较长的串比较。
* */
public class StringDemo3 {
    public static String getMaxSubString(String str1, String str2) {

        if (str1 != null && str2 != null) {
            String maxString = (str1.length() >= str2.length()) ? str1 : str2;
            String minString = (str1.length() < str2.length()) ? str1 : str2;

            int length = minString.length();
            for (int i = 0; i < minString.length(); i++) {
                for (int x=0,y=length - i; y<= length;x++,y++) {
                    String substring = minString.substring(x, y);
                    if (maxString.contains(substring)) {
                        return substring;
                    }
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(getMaxSubString("abcwerthelloyuiodefabcdef", "cvhellobnm"));
    }
}
