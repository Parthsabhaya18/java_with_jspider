//surface area of cone
public class q9 {

    public static void surface_cone(float r,float h,float pi) {
        float cone=(pi*r*r)+(pi*r*h);
        System.out.println("Surface cone:"+cone);
    }
    public static void main(String[] args) {
        surface_cone(10.0f,3.0f,3.14f);
    }
}
