import java.lang.*;
import java.util.Scanner;

class Bitwise{
    public static void main(String ...args){
        int x = 0b10000;
        int y = x>>2;

        System.out.println(y);
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(y)));
    }
}