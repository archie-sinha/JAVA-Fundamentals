import java.util.Scanner;
import java.util.*;

public class Array_sum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        // Display the sum
        System.out.println(sum);

        
        sc.close();
    }
}