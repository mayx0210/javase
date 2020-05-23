package com.myx.demo2;


import java.util.Scanner;

/**
 * CustomerView 为主模块，负责菜单的显示和处理用户操作
 */
public class CustomerView {
    private CustmoerList custList = new CustmoerList(10);

    public CustomerView() {
        Customer customer = new Customer("柯南", '男', 23, "13012342134",
                "ken@abc.com");
        custList.addCustomer(customer);
    }

    /**
     * 进入主界面的方法
     */
    public void enterMainMenu() {

        boolean isFlag = true;

        do {
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择4(1-5)：");

            // 从键盘获取用户1-5的选择
            char menu = CMUtility.readMenuSelection();
            // 使用switch-case对用户的选择，进行区别处理
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    char exit = CMUtility.readConfirmSelection();
                    if (exit == 'Y') {
                        isFlag = false;
                    }
                    break;
            }

        } while (isFlag);

    }

    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        Customer customer;
        int index;
        for(;;) {
            System.out.println("请选择待删除客户编号（-1）退出");
            //针对普通客户来讲，此index从1开始

            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            customer = custList.getCustomer(index - 1);
            if (customer == null) {
                System.out.println("无法找到指定的客户");
            } else {
                break;

            }
        }
        //一旦找到相应的索引位置的customer以后，让用户决定是否确认删除
        System.out.println("确认是否删除(Y/N)：");
        char deleteOrNot = CMUtility.readConfirmSelection();
        if (deleteOrNot == 'Y') {
            boolean flag = custList.deleteCustomer(index - 1);
            if (flag) {
                System.out.println("---------------------删除完成---------------------");
            } else {
                System.out.println("---------------------删除失败---------------------");
            }
        } else {
            return;
        }


    }

    /**
     * 修改指定索引位置的客户信息
     */
    private void modifyCustomer() {
        System.out.println("---------------------------修改客户---------------------------");
        Customer customer;
        int index;
        for(;;) {
            System.out.println("请选择待修改客户编号（-1退出）");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            //对用户来讲，我们让index默认从1开始
            customer = custList.getCustomer(index - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }

        //修改用户信息
        System.out.println("姓名("+customer.getName()+"):");
        String name = CMUtility.readString(5, customer.getName());

        System.out.println("性别("+customer.getGender()+"):");
        char gender = CMUtility.readChar(customer.getGender());

        System.out.println("年龄("+customer.getAge()+"):");
        int age = CMUtility.readInt(customer.getAge()
        );
        System.out.println("电话("+customer.getPhone()+"):");
        String phone = CMUtility.readString(11, customer.getPhone());

        System.out.println("邮箱("+customer.getName()+"):");
        String email = CMUtility.readString(15, customer.getEmail());

        //获取用户输入的属性之后，得到的最新的Customer对象
        customer = new Customer(name, gender, age, phone, email);
        //对于用户来讲，我们让index默认从1开始
        boolean flag = custList.replaceCustomer(index - 1, customer);
        if (flag) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("---------------------修改失败---------------------");
        }

    }

    /**
     * 添加客户列表
     */
    private void addNewCustomer() {
        System.out.println("---------------------------客户列表---------------------------");
        System.out.println("姓名：");
        String name = CMUtility.readString(5);
        System.out.println("性别：");
        char gender = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话：");
        String phone = CMUtility.readString(11);
        System.out.println("邮箱：");
        String email = CMUtility.readString(20);

        //封装一个对象
        Customer customer = new Customer(name, gender, age, phone, email);
        //将次对象添加到CustomerList里的数组里
        boolean flag = custList.addCustomer(customer);
        if (flag) {
            System.out.println("---------------------------添加完成---------------------------");
        } else {
            System.out.println("人数已达上限，添加失败");
        }
    }

    /**
     * 获取客户列表
     */
    public void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        Customer[] allCustomers = custList.getAllCustomers();
        if (allCustomers.length == 0) {
            System.out.println("没有任何客户记录");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t\t邮箱");
            for (int i = 0; i < allCustomers.length; i++) {
                Customer cust = allCustomers[i];
                System.out.println((i+1) + "\t" + cust.info());
            }
        }

        System.out.println("---------------------------客户列表---------------------------");

    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
