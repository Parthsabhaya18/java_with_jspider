import java.util.Scanner;
public class evenodd {
    
    public static void test(int n1)
    {
        if((n1%2==0))
        {
            System.out.println("Even Number!!");
        }
        else{
            System.out.println("Odd nuber!!");
        }
    }

    public static void main(String[] args) 
    {
        System.out.println("Main Methd Started");

        Scanner eo=new Scanner(System.in);
        System.out.print("Enter Number :");
        int a=eo.nextInt();
        test(a);
        System.out.println("Main Methd ended");

    }
}
