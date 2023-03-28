package com.demo;

class MyThread1 extends Thread{
    int total=0;
    @Override
    public void run(){
        synchronized(this){
            System.out.println("Child thread starts execution...");
            for(int i=0; i<=100; i++){
                total = total + i;
            }
            System.out.println("Child thread notifying other thread about its completion....");
            this.notify();
        }
    }
}
public class InterThreadCommunicationExample {
    public static void main(String[] args) throws Exception {
        MyThread1 t = new MyThread1();
        t.start();
        synchronized (t){
            System.out.println("Main thread calling wait method....");
            t.wait();
            System.out.println("Main thread got notification of execution completion...");
            System.out.println("The total is := "+t.total);
        }
    }
}
