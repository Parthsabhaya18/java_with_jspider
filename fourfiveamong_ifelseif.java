public class fourfiveamong_ifelseif {

    public static void main(String[] args) {
        int n1=10,n2=15,n3=7,n4=3;
        int m1=42,m2=23,m3=12,m4=78;

        if((n1>n2) && (n1>n3) && (n1>n4))
        {
            System.out.println("n1 Greater");
        }
        else if((n2>n3) && (n2>n4) && (n2>n1))
        {
            System.out.println("n2 Greater");
        }
        else if((n3>n4) && (n3>n1) && (n3>n2))
        {
            System.out.println("n3 Graeter");
        }
        else
        {
            System.out.println("n4 greater");
        }

        if((m1>m2)&&(m1>m3)&&(m1>m4))
        {
            System.out.println("M1 greater");
        }
        else if((m2>m3)&&(m2>m4)&&(m2>m1))
        {
            System.out.println("m2 greater");
        }
        else if((m3>m4)&&(m3>m1)&&(m3>m2))
        {
            System.out.println("m3 greater");
        }
        else
        {
            System.out.println("m4 greater");
        }
    }
}