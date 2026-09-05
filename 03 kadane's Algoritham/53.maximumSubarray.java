/*
 * Problem: Maximum Subarray (Kadane's Algorithm)
 *
 * Approach:
 * Iterate through the array maintaining a running sum (currentSum)
 * and the maximum sum found so far (maxSum). At each element, decide
 * whether to add the element to currentSum or start a new subarray
 * from the current element. If currentSum drops below zero, reset it to
 * zero (or take Math.max(num, currentSum + num)). Update maxSum at
 * each step.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int cSum=0;
        int maxSum=0;
        for(int i=0;i<nums.length;i++)
        {    
            cSum=Math.max(nums[i],cSum+nums[i]);
            maxSum=Math.max(maxSum,cSum);
            
        }
        return maxSum;
    }
}