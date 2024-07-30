public class objectlaptop {
    String brand;
    String name;
    String processor;
    int price;
    public static void main(String[] args) {
        objectlaptop l1=new objectlaptop();
        l1.brand="dell";
        l1.name="inspriron";
        l1.processor="i3";
        l1.price=78665;
        System.out.println(l1.brand+" "+l1.name+" "+l1.processor+" "+l1.price);

        objectlaptop l2=new objectlaptop();
        l2.brand="hp";
        l2.name="pavilion";
        l2.processor="i7";
        l2.price=62990;
        System.out.println(l2.brand+" "+l2.name+" "+l2.processor+" "+l2.price);


        objectlaptop l3=new objectlaptop();
        l3.brand="apple";
        l3.name="mac-book";
        l3.processor="i7";
        l3.price=110000;
        System.out.println(l3.brand+" "+l3.name+" "+l3.processor+" "+l3.price);


    }
}
