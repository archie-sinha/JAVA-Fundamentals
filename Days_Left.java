//Code by: Archisha Sinha
//Github: https://github.com/archie-sinha
//Linkedin: https://www.linkedin.com/in/archisha-sinha-449924242/

// Finding Number of years, months and days left to complete n-days
import java.util.*;
public class Days_Left
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int n_days = sc.nextInt();
        
        int years = n_days/365;
        int months = (n_days%365)/30;
        int days = (months%30)%24;
        
        System.out.println(years+" Years "+months+ " Months and "+ days +" Days left to complete "+ n_days+ " days");
        
    }
}