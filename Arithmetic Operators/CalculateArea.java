public class CalculateArea{
    public static void main(String args[]){
        int base = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);

        double area = 0.5 * base * height;

        System.out.println(area);
    }
}