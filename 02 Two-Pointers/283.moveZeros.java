/*
 * Problem: Move Zeroes
 *
 * Approach:
 * Use two pointers. One pointer keeps track of the position
 * to place the next non-zero element, while the other traverses
 * the array. After moving all non-zero elements to the front,
 * fill the remaining positions with zeroes.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        for(int r=0;r<nums.length;r++)
        {
            if(nums[r]!=0)
            {
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;l++;

            }
        }

    }
}