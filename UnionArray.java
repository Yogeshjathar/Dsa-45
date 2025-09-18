import java.util.ArrayList;
import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;

        ArrayList<Integer> Union1 = FindUnion_BetterApporach(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is (BetterApporach): ");

        for (int val: Union1){
            System.out.print(val+" ");
        }

        ArrayList<Integer> Union2 = FindUnion_OptimizedApproach(arr1, arr2, n, m);
        System.out.println("\nUnion of arr1 and arr2 is (OptimizedApproach): ");

        for (int val: Union2){
            System.out.print(val+" ");
        }
    }

    // Time complexity :  O( (m+n)log(m+n) )
    // Space complexity : O(1) and If Space of Union ArrayList is considered O(m+n)
    public static ArrayList<Integer> FindUnion_BetterApporach(int arr1[], int arr2[], int n, int m) {
        HashSet <Integer> s=new HashSet<>();
        ArrayList < Integer > Union=new ArrayList<>();
        for (int i = 0; i < n; i++)
            s.add(arr1[i]);
        for (int i = 0; i < m; i++)
            s.add(arr2[i]);
        for (int it: s)
            Union.add(it);
        return Union;
    }

    // Time complexity : O(m+n)
    // Space complexity : O(1) and If Space of Union ArrayList is considered O(m+n)
    public static ArrayList<Integer> FindUnion_OptimizedApproach(int[] arr1, int[] arr2, int n, int m) {
        int i=0, j=0;
        ArrayList<Integer> union = new ArrayList<>();

        while (i < n && j < m) { 
            if(arr1[i] <= arr2[j]){
                if(union.size() == 0 || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }else{
                if(union.size() == 0 || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < n){
            if(union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
            }
            i++;
        }

        while(j < m){
            if(union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
}
