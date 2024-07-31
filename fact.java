class fact{
       public static long fact1(int n){
            if(n==0)
            {
                return 1;
            }
            else{
                return (n*fact1(n-1));
            }
        }
    public static void main(String[] args) {
       long fact=fact1(59);
        System.out.println(fact);
    }
}