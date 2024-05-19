//Code by: Archisha Sinha
//Github: https://github.com/archie-sinha
//Linkedin: https://www.linkedin.com/in/archisha-sinha-449924242/


// WAP to calculate the discount and the final amount according to the total amount of purchase done by the customer. Also display the final bill of the customer
// Amt           |   Dsicount
//<=10k         |   5%
//>10k - 25k    |   10%
//>25k - 40k    |   15%
//>40k          |   20%

import java.util.*;
public class Calculating_Discount
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Enter Mobile Number: ");
        long phone_no = sc.nextLong();
        System.out.println("Enter Address: ");
        String address = sc.next();
        System.out.println("Enter the total amount of purchase: ");
        float amt = sc.nextFloat();
        
        // Calculating Discount
        double dis = 0.0;
        if (amt > 0.0 && amt <= 10000.0)
            dis = 0.05*amt;
        else if (amt > 10000.0 && amt <= 25000.0)
            dis = 0.10*amt;
        else if (amt > 25000.0 && amt <= 40000.0)
            dis = 0.15*amt;
        else
            dis = 0.20*amt;
            
        //Printing the bill
        System.out.println("*******************************");
        System.out.println("Name : " + name);
        System.out.println();
        System.out.println("Mobile Number : " + phone_no);
        System.out.println();
        System.out.println("Address : " + address);
        System.out.println();
        System.out.println("Total Amount : " + amt);
        System.out.println();
        System.out.println("Discount applied : " + dis);
        System.out.println();
        System.out.println("Final amount payable : " + (amt - dis));
        System.out.println();
        System.out.println("THANKYOU FOR VISITING");
        System.out.println();
        System.out.println("*******************************");
        
    }
}