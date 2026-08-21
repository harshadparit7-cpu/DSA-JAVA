/*
 * Problem: Find the Third Maximum Element in an Array
 *
 * Approach:
 * Traverse the array once while maintaining the largest,
 * second largest, and third largest distinct elements.
 * Update these values whenever a larger distinct element is found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
  class Solution {
    public int thirdMax(int[] nums) {
        Long first= null;
        Long second= null;
        Long third= null;
        for(int num:nums)
       {
        if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }
        else if(first==null || num > first)
        {
            third=second;
            second=first;
            first=(long)num;

        }else if(second==null || num > second)
        {
            third=second;
            second=(long)num;
            
        }
        else if(third == null || num>third)
        {
            third=(long)num;
        }
       }
       return third == null ? first.intValue():third.intValue();
    }
}