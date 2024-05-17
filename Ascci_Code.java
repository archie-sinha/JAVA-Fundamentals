//Code by: Archisha Sinha
//Github: https://github.com/archie-sinha
//Linkedin: https://www.linkedin.com/in/archisha-sinha-449924242/

import java.util.*;
public class Ascci_Code
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character or alphabet or number: ");
        char ch = sc.next().charAt(0);
        int ascci = (int)ch;  // Ascci Code
        
        System.out.println("Ascci of " + ch + " :" + ascci);
    }
}