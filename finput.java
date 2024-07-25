import java.util.Scanner;
class finput{
    public static void store(String nm,int a,char gen)
    {
        System.out.println("Your Name :"+nm);
        System.out.println("Your age :"+a);
        System.out.println("Your gender :"+gen);

    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Main Method Is started");

        System.out.print("Enter Your Name :");
        String name= sc.nextLine(); //only next() use so without space || nextLine() use to with space uses
        
        System.out.print("Enter Your Age :");
        int age=sc.nextInt();

        System.out.print("Enter Your Gender :");
        char gender=sc.next().charAt(0);
        System.out.println();
        System.out.println();

        store(name, age, gender);

        System.out.println("Main Method Is Ended");
    }
    }