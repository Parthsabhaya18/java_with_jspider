//  dot operator static variable and function 
 class multipleclass {
     static int a=100;
    static void test()
    {
        System.out.println("test() Method");
    }
}
class multipleclass1{
    static int b=200;
   static void disp()
    {
        System.out.println("disp() Method");
    }
}
class multipleclass2{
    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println("a value :"+multipleclass.a);
        multipleclass.test();
        System.out.println("b value :"+multipleclass1.b);
        multipleclass1.disp();
    }
}

