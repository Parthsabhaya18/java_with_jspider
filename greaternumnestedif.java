public class greaternumnestedif {
    
    public static void main(String[] args) {
        int a=10,b=20,c=300;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("Greater num"+a);
            }
            else{
                System.out.println("greater num"+c);
            }
        }
        else if(b>c)
        {
            System.out.println("Greater num"+b);
        }
        else
        {
            System.out.println("Greater num"+c);
        }
    }
}
