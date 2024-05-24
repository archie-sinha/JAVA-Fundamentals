//Code by: Archisha Sinha
//Github: https://github.com/archie-sinha
//Linkedin: https://www.linkedin.com/in/archisha-sinha-449924242/

// WAP to check whether a number is Palindrome Number or not.
//Ex1: 121 when read from right-to-left is 121, Thus PALINDROME
//Ex2: 56 when read from right-to-left is 65, Thus NOT PALINDROME


class Palindrome 
{
    public boolean isPalindrome(int x) 
    {
        int new_x = 0;
        int original = x;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            int n = x % 10;
            new_x = (10 * new_x) + n; // Correctly building the reversed number
            x = x / 10;
        }
        return new_x == original;
    }
}