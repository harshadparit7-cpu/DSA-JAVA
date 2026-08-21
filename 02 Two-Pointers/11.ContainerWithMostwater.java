/*
 * Problem: Container With Most Water
 *
 * Approach:
 * Use two pointers, one at the beginning and one at the end
 * of the array. Calculate the area between the two heights.
 * Move the pointer with the smaller height inward because
 * moving the taller height cannot increase the area.
 * Keep track of the maximum area found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int maxArea(int[] height) {
       int  l=0;
       int  r=height.length-1;
       int maxArea=0;
        while(l<r)
        {
          int   wid=r-l;
          int h=Math.min(height[l],height[r]);
          int Area =wid*h;
           
           maxArea=Math.max(maxArea,Area);
           if (height[l]<height[r])
           {
            l++;
           }
           else{
            r--;
           }
            
        }
        return maxArea;
    }
}