//run: javac simple_nonstatic.java
        // java Mainclass1     beacuse the mainclass to run

public class simple_nonstatic {
    //non-static variable
    int x=10;
    int y=20;
}
class Mainclass1{
    public static void main(String[] args) {
        System.out.println("Main Method started");
        simple_nonstatic d1;  //declare class type variable
        d1=new simple_nonstatic();   //intializtion of class type variable

        //access non-static 
        System.out.println("x="+d1.x+",y="+d1.y); //dot using beacuse inside a variable to print


        System.out.println("Main Method ended");

    }
}
