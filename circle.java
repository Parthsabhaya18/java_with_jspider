class circle{

    public static void test()
    {
        System.out.println("Test() method is started");
        int r=8;
        float pi=3.14f;
        float result=pi*r*r;
        System.out.println("Square is " +r+ " is "+result);
    }

    public static void main(String [] args)
    {
        System.out.println("main method is started");
        test();
        System.out.println("main method is ended");
    }
}