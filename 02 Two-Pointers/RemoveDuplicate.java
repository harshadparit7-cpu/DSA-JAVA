/*
 * Problem: Remove Duplicates from Sorted Array
 *
 * Approach:
 * Use two pointers. One pointer keeps track of the position
 * for the next unique element, while the other traverses the array.
 * When a new unique element is found, place it at the next position.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=1;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]!=nums[j-1])
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;

    }
}