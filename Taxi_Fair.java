//Code by: Archisha Sinha
//Github: https://github.com/archie-sinha
//Linkedin: https://www.linkedin.com/in/archisha-sinha-449924242/


// WAP to calculate Taxi Fair based on the distance covered
// Distance (km):|first 10|next 20| next 40| >70 km
//Amt/km:       |25/-     |20/-   |15/-    |12/-


import java.util.*;
public class Taxi_Fair
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Distance covered in km: ");
        float km = sc.nextFloat();
        double amount = 0.0;
        int flag =0;
        if (km>0 && km<=10)
        {
            amount = 25*km;
            flag=1;
        }
        else if (km>10 && km<=30)
        {
            amount = (25*10) + (20*(km-10));
            flag=1;
        }
        else if (km>30 && km<= 70)
        {
            amount = (25*10) + (20* 20) + (15*(km-30));
            flag=1;
        }
        else if (km>70)
        {
            amount = (25*10) + (20*20) + (15*40) + (12*(km-70));
            flag=1;
        }
            
        else
            System.out.println("Invalid Distance Input. Please Re-enter the distance.");
        
        if (flag==1)
        {
            System.out.println("The total Fair of the Taxi for "+ km+ "km of distance is " + amount + " Rupees");
        }
    }
}