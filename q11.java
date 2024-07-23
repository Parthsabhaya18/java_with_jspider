//volume of cylinder
public class q11 {
    public static void cylinder(int r,int h,float pi)
    {
        float cy=pi*r*r*h;
        System.out.println("Volume of Cylinder :"+cy);
    }

    public static void main(String[] args) 
    {
        cylinder(5,7,3.14f);
    }
}
