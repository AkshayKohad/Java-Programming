class MyThread extends Thread{
    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++ + "My Thread");
        }
    }
}



class Main {
    public static void main(String[] args) throws Exception
    {
      MyThread t = new MyThread();
      t.start();
      
      int count = 1;
      
      while(true){
          System.out.println(count++ + "Main Thread");
          Thread.yield(); // It means it will wait for some time and allow other thread to work
          // so whichever method we yield it allows other thread for exceution
      }
      
    }
}
