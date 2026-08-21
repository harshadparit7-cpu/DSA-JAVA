/*
 * Problem: Traverse an Array
 *
 * Approach:
 * Visit each element one by one using a loop.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class TraverseArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}