public class factors{
    public static void main(String[] args) {
        int n=8;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
        System.out.println("Count Factors numbers:");
        int num=8,count=0;
        for(int j=1;j<=10;j++)
        {
            if(num%j==0)
            {
                count+=1;
                System.out.println(count);
            }
        }
    }
}