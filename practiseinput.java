import java.util.Scanner;
    public class practiseinput{
    
    public static void form (String n,int a,char g,int r)
    {
        System.out.println("Your Name :"+n);
        System.out.println("Your age :"+a);
        System.out.println("Your Gender :"+g);
        System.out.println("Your rating :"+r);
    }
    public static void main(String [] args)
    {
        System.out.println("Main Method started");
        Scanner form=new Scanner(System.in);
        //name,age,gender,review rate

        System.out.print("Enter Your Name :");
        String name=form.nextLine();

        System.out.print("Enter Your age :");
        int age=form.nextInt();

        System.out.print("Enter Your Gender :");
        char gender=form.next().charAt(0);

        System.out.print("Enter Reivew Rating Out Of 5 :");
        int review=form.nextInt(6);

        form(name,age,gender,review);

        System.out.println("Main Method Ended");
    }
    }
