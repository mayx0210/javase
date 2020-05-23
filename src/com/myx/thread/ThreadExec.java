package com.myx.thread;

public class ThreadExec {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);

        c1.setName("甲");
        c2.setName("乙");
        c1.start();
        c2.start();
    }
}

class Account{
    private double blance;

    public Account(double blance) {
        this.blance = blance;
    }

    public synchronized void deposit(double dep) {
        if (dep > 0) {
           blance += dep;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "：存钱成功，余额为："+ blance);
        }
    }
}

class Customer extends Thread{
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}
