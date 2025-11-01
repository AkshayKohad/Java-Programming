// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class Main {
    public static void main(String[] args) {
        TreeSet<Integer>ts = new TreeSet<>(List.of(10,20,30,40,50));
        
        ts.add(25);
        
        ts.forEach((x)-> System.out.println(x) );
    }
}
