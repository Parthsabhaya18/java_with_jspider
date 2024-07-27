public class switchevenodd {
    public static void main(String[] args) {
        int n=13;
        switch(n%2)
        {
            case 0: System.out.println("Even Number");
                    break;
            case 1: System.out.println("Odd Number");
                    break;
            default: System.out.println("Invalid");
        }
    }
}
