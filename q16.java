//perimeter of semi-circle
public class q16 {
    public static void peri(float pi,float r)
    {
        float circle=pi*r+(2+r);
        System.err.println("perimeter_circle :"+circle);
    }
    public static void main(String[] args) 
    {
        peri(3.14f,5.0f);
    }
}
