public class reintiliazation_object_non_static{
    int x=10;
    int y=20;
}
class mainclass1{
    public static void main(String[] args) {
        System.out.println("started!!");
        reintiliazation_object_non_static d1;
        d1=new reintiliazation_object_non_static();
        System.out.println("x="+d1.x+", y="+d1.y);

        //modify
        d1.x=30;
        d1.y=40;
        //Re-intialization object
        d1=new reintiliazation_object_non_static();
        System.out.println("x="+d1.x+", y="+d1.y);

        //----> modify but not chance because same object creation and then print so value are original
        System.out.println("ended!!");

    }
}