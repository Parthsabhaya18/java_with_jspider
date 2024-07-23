//recentangle with return type
public class rq4 
{
    public static int rec(int num)
    {
        int recc=num;
        return recc;
    }
    public static void main(String[] args) 
    {
        System.out.println("start");
        int a=10;
        int b=20;
        int result=rec(a)*rec(b);
        System.out.println("result:"+result);
        System.out.println("end");

    }
}
