/*
 * Problem: Find the Second Largest Element in an Array
 *
 * Approach:
 * Maintain two variables:
 * - largest
 * - secondLargest
 * Update them while traversing the array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 34};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest Element: " + secondLargest);
    }
}