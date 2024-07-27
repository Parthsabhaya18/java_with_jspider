public class multipleobject_nonstatic {
    int x=10;
    int y=20;
}
class mainclass1{
    public static void main(String[] args) {
        System.out.println("started!!");
        multipleobject_nonstatic d1;
        multipleobject_nonstatic d2;
        d1=new multipleobject_nonstatic();
        d2=new multipleobject_nonstatic();
        System.out.println("First object value--");
        System.out.println("x="+d1.x+",y="+d1.y);
        System.out.println("second object value--");
        System.out.println("x="+d2.x+",y="+d2.y);

        //modify
        d1.x=50;
        d1.y=60;
        System.out.println("After Modify value----s ");
        System.out.println("First object value--");
        System.out.println("x="+d1.x+",y="+d1.y);
        System.out.println("second object value--");
        System.out.println("x="+d2.x+",y="+d2.y);
        System.out.println("ended!!");

    }
}
