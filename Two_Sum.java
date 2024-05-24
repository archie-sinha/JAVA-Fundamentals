//Code by: Archisha Sinha
//Github: https://github.com/archie-sinha
//Linkedin: https://www.linkedin.com/in/archisha-sinha-449924242/

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
*/


class Two_Sum 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] op = new int[2];
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = i + 1; j < nums.length; j++) 
            {
                if (nums[i] + nums[j] == target) 
                {
                    op[0] = i;
                    op[1] = j;
                    return op;
                }
            }
        }
        // This line should never be reached because the problem guarantees exactly one solution.
        throw new IllegalArgumentException("No two sum solution");
    }
}
