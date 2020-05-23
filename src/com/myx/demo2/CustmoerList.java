package com.myx.demo2;



/**
 *  CustomerList为Customer对象的管理模块，内部类用数组管理一组Customer对象，
 * 并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 */

public class CustmoerList {
    private Customer[] customers; //用来保存客户对象的数组
    private int total = 0;      //记录已保存客户对象的数量

    /**
     * 构造器，用来初始化customers数组
     * @param totalCustomer ：指定customer数组的最大空间
     */
    public CustmoerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 添加指定的客户到数组中
     * @param customer
     * @return 添加是否成功
     */
    public boolean addCustomer(Customer customer) {
        if (customer != null && total < customers.length) {
            customers[total ++] = customer;
            return true;
        }
        return false;
    }


    /**
     * 替换指定索引位置的数组元素
     * @param index 从0开始
     * @param cust
     * @return
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 && index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定索引位置的元素
     * @param index  从0开始
     * @return
     */
    public boolean deleteCustomer(int index) {
        if (index >= 0 && index < total) {
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i+1];
            }
            customers[--total] = null;
            return true;
        }
        return false;
    }

    /**
     * 获取所有的customers对象构成的数组
     * @return
     */
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        //给数组元素赋值
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 返回指定索引位置的Customer
     * @param index
     * @return 如果输入的index位置上的元素不存在，返回null
     */
    public Customer getCustomer(int index) {
        if (index >= 0 && index < total) {
            return customers[index];
        }

        return null;
    }

    /**
     * 返回Customer对象的个数
     * @return
     */
    public int getTotal() {
        return total;
    }
}
