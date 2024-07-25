import java.util.Scanner;
public class max3num{

public static void test(int n1,int n2,int n3)
{
     if((n1>n2)&&(n1>n3))
    {
        System.out.println("a is greater:"+n1);
    }
    else if((n2>n3)&&(n2>n1))
    {
        System.out.println("b is graeter:"+n2);
    }
    else if((n3>n1)&&(n3>n2))
    {
        System.out.println("c is graeter:"+n3);
    }
    else
    {
        System.out.println("all are same value");
    }
}
    public static void main(String[] args) 
    {
        System.out.println("Main method started");
        Scanner parth=new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=parth.nextInt();
        System.out.print("Enter b value:");
        int b=parth.nextInt();
        System.out.print("Enter c value:");
        int c=parth.nextInt();
        test(a,b,c);
        System.out.println("Main method ended");

    }
}

