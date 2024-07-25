class alarm{

    public static String test(int day,boolean vacation)
    {
        if(vacation==false)
        {
            if(day>=1&&day<=5)
            {
                System.out.println("7:00");

            }
            else
            {
                System.out.println("10:00");
                
            }
            return "false";
            
        }
        else{
            if(day>=1&&day<=5)
            {
                System.out.println("10:00");
                
            }
            else
            {
                System.out.println("Off");
              
            }
            return "true";
        }
    }
    public static void main(String[] args) 
    {
     test(0,true);   
    }
}


