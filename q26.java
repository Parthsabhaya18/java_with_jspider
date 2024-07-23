//calculate area of trapezoid
public class q26 {
public static void trap(int a,int b,int h) 
{
    float area=((a+b)/2.0f*h);
    System.out.println("trapezoid is :"+area);
}
    public static void main(String[] args) 
    {
        trap(3,4,6);
    }
}
