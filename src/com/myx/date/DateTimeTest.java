package com.myx.date;

import org.junit.Test;

import java.util.Date;

public class DateTimeTest {
    /**
     * java.util.Date类
     * |--java.sql.Date类
     * 1、两个构造器的使用
     * 构造器一：Date():创建一个对应时间的Date对象
     * 构造器二：创建指定毫秒数的Date对象
     * 2、两个方法的使用
     * toString()：显示当前的年、月、日、时、分、秒
     * getTime()：获取当前Date对象对应的毫秒数。（时间戳）
     * <p>
     * 3、java.sql.Date对应着数据库中的日期类型的变量
     */

    @Test
    public void test1() {

        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差
        long time = System.currentTimeMillis();

        System.out.println(time);
    }

    @Test
    public void test2() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString());

        Date date1 = new Date(1587645935013L);
        System.out.println(date1.toString());

        //创建java.sql.Date对象
        java.sql.Date date2 = new java.sql.Date(1587645935013L);
        System.out.println(date2);

        //将java.util.Date对象转换为java.sal.Date对象
        Date date3 = new Date();
        java.sql.Date date4 = new java.sql.Date(date3.getTime());
        System.out.println(date4);
    }
}
