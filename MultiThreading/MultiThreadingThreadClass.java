// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MyThread extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}

public class MultiThreadingThreadClass {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        
        int i=1;
        while(true){
            System.out.println(i+" World");
            i++;
        }
    }
}
