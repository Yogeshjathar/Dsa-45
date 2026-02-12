import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {3, 4, 5, 7, 8};
        int n = arr1.length, m = arr2.length;

        ArrayList<Integer> intersection1 = FindIntersection_BetterApproach(arr1, arr2, n, m);
        System.out.println("Intersection of arr1 and arr2 is (BetterApproach): ");
        for (int val : intersection1) {
            System.out.print(val + " ");
        }

        ArrayList<Integer> intersection2 = FindIntersection_OptimizedApproach(arr1, arr2, n, m);
        System.out.println("\nIntersection of arr1 and arr2 is (OptimizedApproach): ");
        for (int val : intersection2) {
            System.out.print(val + " ");
        }
    }

    // Time complexity :  O(n+m)
    // Space complexity : O(n+m)
    public static ArrayList<Integer> FindIntersection_BetterApproach(int[] arr1, int[] arr2, int n, int m) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        for(int num : arr1){
            hs.add(num);
        }

        for(int num : arr2){
            if( hs.contains(num)){
                intersection.add(num);
            }
        }   
        return intersection;
    }

    // Time complexity :  O(n+m)
    // Space complexity : O(n+m)
    public static ArrayList<Integer> FindIntersection_OptimizedApproach(int[] arr1, int[] arr2, int n, int m) {
        int i=0, j=0;
        ArrayList<Integer> intersection = new ArrayList<>();
        while(i < n && j < m){
            if(arr1[i] == arr2[j]){
                if(intersection.size() == 0 || intersection.get(intersection.size()-1) != arr1[i]){
                    intersection.add(arr1[i]);
                }
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }

        return intersection;
    }
}
