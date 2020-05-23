package com.myx.string;


import org.junit.Test;


/*
* 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
* */
public class StringDemo1 {
    //方法一：转化为char[]数组
    public String reverse(String str, int start, int end) {
        if (str != null) {
            char[] chars = str.toCharArray();
            for (int i = start, j = end; i < j; i++, j--) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            return new String(chars);
        } else {
            return null;
        }

    }

    //方法二：字符串拼接法
    public String reverse1(String str, int start, int end) {
        if (str == null) {
            return null;
        }
        //第一部分
        String substring = str.substring(0,start);
        //第二部分
        for (int i = end; i >= start; i--) {
            substring += str.charAt(i);
        }
        //第三部分
        substring += str.substring(end+1);

        return substring;
    }

    //方法三：用StringBuilder代替String
    public String reverse2(String str, int start, int end) {
        if (str != null) {
            StringBuilder sb = new StringBuilder(str.length());
            //第一部分
            sb.append(str.substring(0,start));
            //第二部分
            for (int i = end; i >= start ; i--) {
                sb.append(str.charAt(i));
            }
            //第三部分
            sb.append(str.substring(end + 1));
            return sb.toString();
        }
        return null;
    }

    public static void main(String[] args) {
        String str = new String("abcdefg");
        StringDemo1 sd = new StringDemo1();
        System.out.println(sd.reverse2(str, 2, 5));
    }

   /* @Test
    public void TestDemo(){
        String str = "abcdefg";
        String reverse = reverse(str, 2, 5);
        System.out.println(reverse);
    }*/
}
