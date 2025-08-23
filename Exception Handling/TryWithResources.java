public class TryWithResources {
    
    static FileInputStream fi;
    
    static void Divide() throws Exception
    {
        fi = new FileInputStream("/Users/akshay/desktop/input.txt");
        try{
        Scanner sc = new Scanner();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println(a/c);
        }
        finally{
            fi.close();
            sc.close();
        }
        
    }
    public static void main(String[] args) throws Exception {
        Divide();
    }
}
