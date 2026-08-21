/*
 * Problem: Find the Largest Element in an Array
 *
 * Approach:
 * Assume the first element is the largest.
 * Traverse the array and update the largest element whenever a bigger
 * element is found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class LargestElement {

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 34};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest Element: " + largest);
    }
}