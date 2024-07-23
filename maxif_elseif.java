public class maxif_elseif {
    
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        if((a>b)&&(a>c))
        {
            System.out.println("a :"+a);
        }
        else if(b>c && b>a)
        {
            System.out.println("b :"+b);
        }
        else if(c>a && c>b)
        {
            System.out.println("c :"+c);
        }
        else
        {
            System.out.println("all values are same");
        }

    }
}
