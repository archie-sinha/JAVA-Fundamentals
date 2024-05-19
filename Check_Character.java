//Code by: Archisha Sinha
//Github: https://github.com/archie-sinha
//Linkedin: https://www.linkedin.com/in/archisha-sinha-449924242/

// Check whether a character is a special character, digit or blank space or vowel or a consonent
import java.util.*;
public class Check_Character
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch == '1' || ch == '2' || ch == '3' || ch == '4'|| ch == '5' || 
            ch == '6' || ch == '7' || ch == '8' || ch == '9' || ch == '0')
            {
                System.out.println("Character is a Digit");
            }
        else if (ch == '#' || ch == '@' || ch == '!' || ch == '$'|| ch == '^'        || ch == '^' || ch == '*')
            {
                System.out.println("Character is a Special Character");
            }
        else if (ch == ' ')
            {
                System.out.println("Character is a Blank Space");
            }
        else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'   || ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O'|| ch == 'U')
            {
                System.out.println("Character is a Vowel");
            }
        else
        {
            System.out.println("Character is a Consonent");
        }
    }
}