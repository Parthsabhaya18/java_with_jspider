class dot{
    //access static variable by dot(.)operator
    static int a=10;
    static int b=20;
}
class dot1{
    static int x=100;
    static void test(){
        int y=200; //local variable
        System.out.println("y value:"+y);
        System.out.println("test() Method");
    }
}
class sttatic{
    public static void main(String[] args) 
    {
        System.out.println("main method started--");
        // dot.a sysntax of dot operator for static
        System.out.println("a value:"+dot.a);  
        System.out.println("b value :"+dot.b);
        System.out.println("Re-Intilazation Value--");
        dot.a=30;
        dot.b=40;
        System.out.println("a value :"+dot.a);
        System.out.println("b value :"+dot.b);
        System.out.println("x value:"+dot1.x); 
        dot1.test();
        System.out.println("main method ended--");

    }
}
