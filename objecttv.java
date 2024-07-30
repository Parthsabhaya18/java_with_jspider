public class objecttv {
    String name;
    String type;
    int price;
    public static void main(String[] args) {
        objecttv tv1=new objecttv();
        tv1.name="sony";
        tv1.type="lcd";
        tv1.price=145000;
        System.out.println(tv1.name+" "+tv1.type+" "+tv1.price);
        // System.out.println(tv1);  address of object

        objecttv tv2=new objecttv();
        tv2.name="mi";
        tv2.type="led";
        tv2.price=28765;
        System.out.println(tv2.name+" "+tv2.type+" "+tv2.price);
        // System.out.println(tv2);


        objecttv tv3=new objecttv();
        tv3.name="one-plus";
        tv3.type="led";
        tv3.price=25567;
        System.out.println(tv3.name+" "+tv3.type+" "+tv3.price);
        // System.out.println(tv3);


    } 
}
