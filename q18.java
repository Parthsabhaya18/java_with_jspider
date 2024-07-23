//total surface area of cuboid
public class q18 {

    public static void cuboid(int l,int b,int h) 
    {
        int cube=2*(l*b+b*h+l*h);
        System.out.println("Surface area of cuboid :"+cube);
    }
    public static void main(String[] args) 
    {
        cuboid(20,15,8);
    }
}
