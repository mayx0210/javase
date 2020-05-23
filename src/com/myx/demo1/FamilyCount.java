package com.myx.demo1;

import java.util.Scanner;

public class FamilyCount {
    public static void main(String[] args) {

        int balance = 1000;  //生活基本金
        String detils = "收支 账户金额 收支金额  说明\n";
        while (true) {

            System.out.println("----------家庭收支记账软件----------");
            System.out.println("          1 收支明细");
            System.out.println("          2 登记收入");
            System.out.println("          3 登记支出");
            System.out.println("          4 退出");
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            System.out.println("          请选择(1-4):");

            System.out.println("---------------------------------");
            int num = scanner.nextInt();


            switch (num) {

                case 1:
                    System.out.println("----------当前收支明细记录----------");
                    System.out.println(detils);
                    System.out.println("----------------------------------");
                    //System.out.println("收支 账户金额 收支金额  说明");
                   // System.out.println("收入 " + income + income + explain );
                    break;

                case 2:
                    System.out.println("请输入收入金额：");
                    int income = scanner.nextInt();
                    System.out.println("请输入收入说明：");
                    String explain = scanner.next();
                    balance += income;
                    detils += "收入" + "\t" + balance + "\t" + income + "\t\t" + explain + "\n";
                    System.out.println("----------记录完成----------");
                    break;
                case 3:
                    System.out.println("请输入支出金额：");
                    int outcome = scanner.nextInt();
                    System.out.println("请输入支出说明：");
                    String info = scanner.next();
                    balance -= outcome;
                    detils += "收入" + "\t" + balance + "\t" + outcome + "\t\t" + info + "\n";
                    System.out.println();

                    System.out.println("----------记录完成----------");
                    break;
                case 4:
                    System.out.println("确认是否退出(Y/N)");
                    String booleanFlog = scanner.next();
                    if (booleanFlog.equals("Y")) {
                        System.exit(0);

                    }
                    break;
                default:
                    System.out.println("输入非法，请重新输入");
            }

        }
    }
}
