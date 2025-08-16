import java.lang.*;
import java.util.Scanner;

class CalculateArea{

    public static void main(String args[]){
        float base,height,area;

        System.out.println("Enter base and height to calculate area");

        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();

        area = 1f/2f*base*height;

        System.out.println("Area of Triangle is " + area);

    }
}