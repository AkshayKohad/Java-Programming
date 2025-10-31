// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class MyCom implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2){
        if(o1<o2)return 1;
        else if(o1>o2)return -1;
        
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
      //MIN HEAP    
      PriorityQueue<Integer>pq = new PriorityQueue<>();
      pq.add(10);
      pq.add(20);
      pq.add(30);
      pq.add(40);
      pq.add(50);
      
      System.out.println(pq.peek());
      
      pq.forEach((x)-> System.out.println(x));
      
      pq.poll();
      
      System.out.println(pq.peek());
      
      //MAX HEAP
      PriorityQueue<Integer>pq1 = new PriorityQueue<>(new MyCom());
      pq1.add(10);
      pq1.add(20);
      pq1.add(30);
      pq1.add(40);
      pq1.add(50);
      
      System.out.println(pq1.peek());
    }
}
