//area of triangle with return type
public class rq3 
{
public static float triangle(float num) 
{
    float tri=num;
    return tri;
}

    public static void main(String[] args) 
    {
        System.out.println("start");
        float b=10.2f;
        float h=5.0f;
        float result=triangle(b)*triangle(h)/2.0f;
        System.out.println("result :"+result);
        System.out.println("end");

    }
}
