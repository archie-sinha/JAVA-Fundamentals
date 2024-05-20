//Code by: Archisha Sinha
//Github: https://github.com/archie-sinha
//Linkedin: https://www.linkedin.com/in/archisha-sinha-449924242/

// Finding Largest Number amongst 3 numbers
import java.util.*;
public class Largest_Number
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number:");
        int c = sc.nextInt();
        char ch = ' ';
        int large;
        
        if (a>b && a>c)
        {
            large=a;
            ch='a';
        }
            
        else if (b>a && b>c)
        {
            large=b;
            ch='b';
        }
            
        else if (c>a && c>b)
        {
             large=c;
             ch='c';
        }
           
        else
            large=a;
            
        System.out.println("The largest number is: " + ch + " = " + large);

        
    }
}