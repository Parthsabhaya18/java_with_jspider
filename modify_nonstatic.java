//run: javac modify_nonstatic.java
        // java Mainclass1     beacuse the mainclass to run
public class modify_nonstatic {
    int x=10;
    int y=20;
}
class Mainclass1{
    public static void main(String[] args) {
        System.out.println("Main method is started!!");
        modify_nonstatic d1;
        d1=new modify_nonstatic();
        System.out.println("x="+d1.x+", y="+d1.y);

        System.out.println("modifying variable of object");
        d1.x=50;
        d1.y=60;
        System.out.println("x="+d1.x+", y="+d1.y);

        System.out.println("Main method is ended!!");

    }
}
