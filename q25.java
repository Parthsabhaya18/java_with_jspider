//calculate total percentage w.r.t 4 subject where max marks is 80 for each subject
public class q25 
{
    public static void sub(int math,int guj,int sci,int eco) 
    {
        int total=math+guj+sci+eco;
        float per=total*100/320f;
        System.out.println("Total marks :"+total);
        System.out.println("Percentage :"+per);
    }
    public static void main(String[] args) 
    {
        sub(89,67,83,75);
    }
}
