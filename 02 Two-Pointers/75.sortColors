/*
 * Problem: Sort Colors
 *
 * Approach:
 * Use three pointers to divide the array into three sections:
 * 0s at the beginning, 1s in the middle, and 2s at the end.
 * Move the pointers based on the current element and sort the
 * array in a single pass using the Dutch National Flag algorithm.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }

}