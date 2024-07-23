//calculate simple interest
public class q24 {
public static void interest(float p,float t,float r) //p-- principal amount //t--time//r--rate
{
    float sim=(p*t*r)/100;
    System.out.println(sim);
}

    public static void main(String[] args) 
    {
        interest(3000,7,1);
    }
}
