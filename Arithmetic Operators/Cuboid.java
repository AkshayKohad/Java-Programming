import java.lang.*;
import java.util.Scanner;

class Cuboid{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int TotalArea,Volume;

        System.out.println("Mention dimensions as length,breadth and height");

        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int height = sc.nextInt();

        Volume = length*breadth*height;

        TotalArea = 2*(length*breadth + breadth*height + height*length);

        System.out.println("Total Area of Cuboid is " + TotalArea);
        System.out.println("Total volume of Cuboid is " + Volume);


    }
}