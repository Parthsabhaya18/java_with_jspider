class chainuser{
    public static void test()
    {
        System.out.println("Test() function");
    }
    public static void disp()
    {
        System.out.println("disp start");
        test();
        System.out.println("disp end");
    }
    public static void view()
    {
        System.out.println("view start");
        disp();
        System.out.println("view end");
    }

    public static void main(String[] args)
    {
        System.out.println("Started");
        view();
        System.out.println("end");
       
    }
}