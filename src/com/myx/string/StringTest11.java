package com.myx.string;

public class StringTest11 {
    public static void main(String[] args) {
        /*String str = null;
        StringBuffer sb = new StringBuffer();
        //sb.append(str);
       // System.out.println(sb.length());

        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);*/


        String a = "123";
        String b = "123";
        String c = new String("123");
        String d = new String("123");

        System.out.println(a.equals(b));
        System.out.println(a==b);

        System.out.println(c.equals(d));
        System.out.println(c==d);

        System.out.println(a.equals(c));
        System.out.println(a==c);

        String m = "ab";
        m = "we";
        System.out.println(m);
    }
}
