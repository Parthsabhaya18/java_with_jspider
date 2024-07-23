//number positive,negative and nutural then nested even odd prog
public class nestedifpositivenegevenodd {
    
    public static void main(String[] args) 
    {
        int n=11;
        if(n>0)
        {
            System.out.println("Positive Number");
            if(n%2==0)
            {
                System.out.println("Even Number");
            }
            else
            {
                System.out.println("odd Number");
            }
        }
        else if(n<0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Nutural");
        }
    }
}
