package com.org;


import java.util.concurrent.*;

public class DemoStatic {
    boolean[] arr = new boolean[3];
    int count = 0;
    void set(boolean[] arr, int x) {
        arr[x] = true;
        count++;
    }

    void fun() {
        if(arr[0]&& arr[++count -1] | arr[count-2])
            count++;
        System.out.println("count="+count);

    }
     public static void main(String[] args) {
        DemoStatic obj = new DemoStatic();
        obj.set(obj.arr, 0);
         obj.set(obj.arr, 1);
         obj.fun();

         Executor e ;
         ExecutorService es;

         ThreadPoolExecutor tpe;
         ScheduledThreadPoolExecutor te;
         ForkJoinPool fp;

         //2,3, 5
    }
}

class T extends Thread {
    public void run() {
        for(int i=1;i<100;i++) {
            System.out.println(i);
        }
    }

}
