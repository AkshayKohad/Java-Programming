class MyData{
    int value;
    boolean flag = true;
    
    synchronized public void set(int x){
        
        while(flag!=true){
            try{wait();}catch(Exception e){}
        }
        
        value = x;
        flag = false;
        notify();
    }
    
    synchronized public int get(){
        
        while(flag!=false){
            try{wait();}catch(Exception e){}
        }
        
        int x = value;
        flag = true;
        notify();
        return x;
    }
}


class Producer extends Thread{
    MyData data;
    
    Producer(MyData data){
        this.data = data;
    }
    
    public void run(){
        int count = 0;
        
        while(true){
            System.out.println("Producer " + count);
            this.data.set(count);
            count++;
        }
        
    }
}

class Consumer extends Thread{
    MyData data;
    
    Consumer(MyData data){
        this.data = data;
    }
    
    public void run(){
        
        while(true){
            int value = this.data.get();
            System.out.println("Cosumer "+ value);
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        MyData data = new MyData();
        
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        
        p.start();
        c.start();
        
    }
}
