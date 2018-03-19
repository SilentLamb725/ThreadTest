package com.company.ticket;

class MyThreadR implements Runnable {

    private int ticketsCount = 5;   // 一共有5张火车票

    @Override
    public void run() {
        while(ticketsCount > 0) {
            ticketsCount--;       // 如果还有票，就卖掉一张
            System.out.println(Thread.currentThread().getName() + "卖了一张票，剩余票数为：" + ticketsCount);
        }
    }
}
public class TicketsRunnable {

    public static void main(String[] args) {
        MyThreadR mtr = new MyThreadR();
        Thread thread1 = new Thread(mtr, "窗口1");
        Thread thread2 = new Thread(mtr, "窗口2");
        Thread thread3 = new Thread(mtr, "窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
