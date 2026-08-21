/*
 * Problem: Rotate Array
 *
 * Approach:
 * Rotate the elements of the array to the right by k positions.
 * Use the reverse technique: first reverse the entire array,
 * then reverse the first k elements and finally reverse the
 * remaining elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public void rotate(int[] nums, int k) {

       int n=nums.length; 
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    public static void reverse(int []nums,int left,int right)
    {
        
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }

    }
    
}