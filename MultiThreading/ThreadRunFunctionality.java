
class MyThread extends Thread{
    MyThread(String name){
        // To give name to thread which will be given by original thread class that's why use super
        super(name);
    }
        public void run(){
            int count = 1;
            while(true){
                System.out.println(count);
                count++;
                try{
                Thread.sleep(10); // This should always be in try catch block to capture InterruptedException
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
      
    
}
public class ThreadRunFunctionality {
    public static void main(String[] args) {
       
       MyThread t = new MyThread("My Thread name Th1");
       
       // To start Thread
       t.start();
      
       // When I use Interupt it should cause Exception
       t.interrupt();
       
       // It will print only 1 time as I called it only 1 time
       // So after printing first number when it was sleeping 
       // main method has interrupted it, so that caused InterruptedException, that exception is handled and printed in catch line shown in run() function
       // So it will delay the thread and also interupt any sleeping thread and wake it up for continuos excecution
    }
}
