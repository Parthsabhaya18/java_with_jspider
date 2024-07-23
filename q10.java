//volume of cone
public class q10 {
    public static void volume(float r,float h,float pi)
    {
        float cone=1/3.0f*pi*r*r*h;
        System.out.println("Volume Of Cone:"+cone);
    }
    public static void main(String[] args) 
    {
        volume(5.0f,2.0f,3.14f);
    }
}
