public class MinElement {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int getMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 7, 3};
        System.out.println(getMin(arr));
    }
}
