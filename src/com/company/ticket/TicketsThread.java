package com.company.ticket;

class MyThread extends Thread {

    private int ticketsCount = 5;   // 一共有5张火车票
    private String name;      // 窗口，既是线程的名字

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while(ticketsCount > 0) {
            ticketsCount--;       // 如果还有票，就卖掉一张
            System.out.println(name + "卖了一张票，剩余票数为：" + ticketsCount);
        }
    }
}

public class TicketsThread {
    public static void main(String[] args) {

        // 创建三个线程模拟三个窗口卖票
        MyThread mt1 = new MyThread("窗口1");
        MyThread mt2 = new MyThread("窗口2");
        MyThread mt3 = new MyThread("窗口3");

        // 启动三个线程，三个窗口开始卖票
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
