//Code by: Archisha Sinha
//Github: https://github.com/archie-sinha
//Linkedin: https://www.linkedin.com/in/archisha-sinha-449924242/


// WAP to make a calculator using Switch Case


import java.util.*;
public class Calculate_SwitchCase
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Choices :");
        System.out.println("1. Addition  2. Subtraction 3. Multiplication 4. Division 5. Modulous");
        System.out.println("Enter your choice as 1,2,3, or 4");
        int choice = sc.nextInt();
        System.out.println("Enter the value of two numbers you want to do operation on: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        
        switch (choice)
        {
            case 1: System.out.println (a+b);
                    break;
            case 2: System.out.println (a-b);
                    break;
            case 3: System.out.println (a*b);
                    break;
            case 4: System.out.println (a/b);
                    break;
            case 5: System.out.println (a%b);
                    break;
            default : System.out.println("Invalid case");
                        break;
        }
        
    }
}