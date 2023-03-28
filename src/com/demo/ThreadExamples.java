package com.demo;

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" <-> "+i);
        }
    }
}
public class ThreadExamples {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        System.out.println("Inside main thread....");
        t.join();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" <-> "+i);
        }
    }
}
