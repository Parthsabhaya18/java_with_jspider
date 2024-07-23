class amount
{
    public static void gst()
    {
        System.out.println("gst() function is started");
        float price=15000.00f;
        float gst=price*0.18f;
        float total=price+gst;
        System.out.println("Final price is:"+total);

    }

    public static void main(String[] args)
    {
        gst();
    }
}