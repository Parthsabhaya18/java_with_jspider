class square{

    public static void test()
    {
        System.out.println("Test() method is started");
        int n=8;
        int result=n*n;
        System.out.println("Square is " +n+ " is"+result);
    }

    public static void main(String [] args)
    {
        System.out.println("main method is started");
        test();
        System.out.println("main method is ended");
    }
}