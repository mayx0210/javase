package com.myx.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    @Test
    public  void Test1() {
        Collection arrayList = new ArrayList();
        arrayList.add("aa");
        arrayList.add("bb");
        arrayList.add("cc");
        arrayList.add("dd");
        arrayList.add("aa");

        System.out.println(arrayList.size());

        System.out.println(arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Object[] objects = arrayList.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        Collection arrayList1 = new ArrayList();
        arrayList1.add("ee");
        arrayList1.add("ff");

        arrayList.addAll(arrayList1);
        System.out.println(arrayList.size());

        System.out.println(arrayList.containsAll(arrayList1));
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList.size());
    }

    @Test
    public void Test2() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(234);
        coll.add(new Person("zs", 23));

        Iterator ob = coll.iterator();

        System.out.println(coll.contains(123));
        System.out.println(coll.contains(new Person("zs", 23)));
    }

    @Test
    public void ForTest() {
        String[] str = new String[5];
        for (String s : str) {
            s = "abc";
            System.out.println(s);
        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
