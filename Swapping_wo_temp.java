//Code by: Archisha Sinha
//Github: https://github.com/archie-sinha
//Linkedin: https://www.linkedin.com/in/archisha-sinha-449924242/

import java.util.*;
public class Swap_wo_temp
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        
        //Initial Values of 'a' and 'b'
        System.out.println("Initial Values of 'a' and 'b' ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //Swapping 2 numbers without 3rd temporary variable
        a = a+b;
        b = a-b;
        a = a-b;
        
        //Final Values after Swapping of 'a' and 'b'
        System.out.println("Final Values after Swapping of 'a' and 'b'");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}