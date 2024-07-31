// Que:- in 2 km --> 30rs
//       Next 5 km -->10rs/per km   
//       Next 5 km -->15rs/per km
//       Next 5 km -->20rs/per km
//       Next  --> 25 rs/per km

public class taxifare{
    public static void main(String[] args) {
        int distance=17;
        if(distance<=2)
        {
            System.out.println(30);
        }
        else if(distance<=7)
        {
            System.out.println(30+((distance-2)*10));
        }
        else if(distance<=12)
        {
            System.out.println(80+((distance-7)*15));
        }
        else if(distance<=17)
        {
            System.out.println(155+((distance-12)*20));
        }
        else
        {
            System.out.println(255+((distance-17)*25));
        }
    }
}