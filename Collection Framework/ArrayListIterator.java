// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
    //Creates an ArrayList named al1 that can hold Integer objects.    
    ArrayList<Integer>al1 = new ArrayList<>(20);
    //Creates another ArrayList al2 and initializes it with five elements: [1,2,3,4,5].
    ArrayList<Integer>al2 = new ArrayList<>(List.of(1,2,3,4,5));
    
    //Add element 10 to al1
    al1.add(10);
    //Inserts 5 at index 0, shifting existing elements to the right.
    al1.add(0,5);
    
    //Adds all elements of al2 ([50, 60, 70, 80, 90]) at the end of al1.
    al1.addAll(al2);
    
    //Adds all elements of al2 starting at index 1.
    al1.addAll(1,al2);
    
    //Replaces the element at index 6 (90) with 100.
    al1.set(6,100);
    
    //Uses a lambda expression to print each element in the list one by one.
    al1.forEach(n -> System.out.println(n));
    
    //Prints each element again, using a method reference — a shorter form of the previous statement.
    //So far, the list elements are printed twice.
    al1.forEach(System.out::println);
    
    //Calls the static show() method for each element in al1.
    al1.forEach(n -> show(n));
    
    //Checks whether al1 contains the element 25.
    System.out.println(al1.contains(25));
    
    //Gets and prints the element at index 5, which is 70.
    System.out.println(al1.get(5));
    
    //Gives first occurence element
    System.out.println(al1.indexOf(70));
    
    //Gives last occurence element 
    System.out.println(al1.lastIndexOf(70));

    // Prints whole al1 array
    System.out.println(al1);

    for (int i = 0; i < al1.size(); i++)
    System.out.println(al1.get(i));

    for (Integer x : al1)
    System.out.println(x);

    for (Iterator<Integer> it = al1.iterator(); it.hasNext();)
    {
        java.lang.Integer x = it.next();
        System.out.println(x);
    }

    ListIterator<Integer> it = al1.listIterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }

}
    
static void show(int n)
{
     if (n > 60)
        System.out.println(n);
}


}
