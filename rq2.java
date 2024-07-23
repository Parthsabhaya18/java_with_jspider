//area of circle with return type
public class rq2 {
    public static float circle(float num)
    {
        float circ=num;
        return circ;
    }

    public static void main(String[] args) 
    {
        System.out.println("started");
        float pi=3.14f;
        float r=10.f;
        float result=circle(pi)*circle(r)*circle(r);
        System.out.println("Result:"+result);
        System.out.println("end");

    }
}
