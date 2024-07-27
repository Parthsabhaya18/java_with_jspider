public class object_adderess {
    int x=10;
    int y=20;
}
class mainclass1{
    public static void main(String[] args) {
        System.out.println("started!!");
        
        object_adderess d1=new object_adderess();
        System.out.println(d1);
        //print a address of class type variable

        System.out.println("ended!!");

    }
}
