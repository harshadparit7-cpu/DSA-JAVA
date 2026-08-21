/*
 * Problem: Two Sum II - Input Array Is Sorted
 *
 * Approach:
 * Use two pointers, one at the beginning and one at the end
 * of the sorted array. If the sum of the two elements is less
 * than the target, move the left pointer forward. If the sum
 * is greater than the target, move the right pointer backward.
 * When the sum equals the target, return their 1-based indices.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<r)

        {    int sum=numbers[l]+numbers[r];
            if(sum==target)
            {   
                    return new int[]{l+1,r+1} ;  

            }
            else if(sum<target)
             l++;
            else
            r--;
        }
       return new int[]{} ;
    }
}