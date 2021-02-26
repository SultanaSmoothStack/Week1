package com.sultana.Assignment2;

import java.sql.SQLOutput;
public class DeadlockThread {
    String s1 = "Sultana";
    String s2 = "Khandaker";

    Thread t1 = new Thread(){
    public void run(){
        while(true){
            synchronized (s1) {
                try {
                    System.out.println(Thread.currentThread().getName()+ " Locked " +s1);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (s2) {
                    System.out.println(s1 + s2);
                }
            }
        }
    }
    };
    Thread t2 = new Thread(){
        public void run(){
            while(true){
                synchronized (s2) {
                    System.out.println(Thread.currentThread().getName()+ " Locked " +s2);
                    synchronized (s1) {
                        System.out.println(Thread.currentThread().getName()+ " Locked " +s1);
                        System.out.println(s1 + s2);
                    }

                }
            }
        }
    };

    public static void main(String[] args) {
        DeadlockThread object  = new DeadlockThread();
        object.t1.start();
        object.t2.start();

    }}