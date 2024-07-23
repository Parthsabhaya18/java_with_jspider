public class undefinedRecursive
{
    public static void test(int n)
    {
        System.out.println(n+"");
        test(++n);
    }
    public static void main(String[] args) 
    {
        System.out.println("Main Method Is started");
        test(1);  
        System.out.println("Main Method Is ended");
  
    }    

}
