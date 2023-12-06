package com.example.testweb.listener.session;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterExample {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args){
        for(int i = 0; i<10; i++){
            Thread thread = new Thread(new CounterIncrementer());
            thread.start();
        }
    }
    public static class CounterIncrementer implements Runnable{

        @Override
        public void run() {
            // 在這裡對計數器進行操作，使用AtomicInteger的incrementAndGet()方法
            int newValue = counter.incrementAndGet();
            System.out.println("Thread " + Thread.currentThread().getId() + " - New Value: " + newValue);
            System.out.println("Current Thread: " + Thread.currentThread().getId() + " - Counter Value: " + counter.get());
        }

    }

}
