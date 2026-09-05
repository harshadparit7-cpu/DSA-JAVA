/*
 * Problem: Remove Element from an Array
 *
 * Approach:
 * Use two pointers. Traverse the array and copy every element
 * that is not equal to the target value to the front of the array.
 * The final index represents the new length of the modified array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int removeElement(int[] nums, int val) {
       
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
               nums[j]=nums[i];
               j++;


            }
        }
       
       
       
     return j;
   
      }


}