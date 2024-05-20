//Code by: Archisha Sinha
//Github: https://github.com/archie-sinha
//Linkedin: https://www.linkedin.com/in/archisha-sinha-449924242/


import java.util.*;
public class Swapping_two_no
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int b = sc.nextInt();
        
        //Initial Values of 'a' and 'b'
        System.out.println("Initial Values of 'a' and 'b'");
        System.out.println("a = " +""+ a);
        System.out.println("b = " +""+ b);
        
        //Swapping 2 numbers
        int temp = a;
         a = b;
         b = temp;
        
        //Final Values after Swapping of 'a' and 'b'
        System.out.println("Final Values after Swapping of 'a' and 'b'");
        System.out.println("a = " +""+ a);
        System.out.println("b = " +""+ b);
    }
}