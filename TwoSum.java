
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] getTwoSumIndex_BruteForce(int arr[], int sum){

        // Outer loop
        for(int i=0; i<arr.length-1; i++){
            // nested loop
            for(int j=i+1; j<arr.length; j++){
                // check sum and return
                if(arr[i]+arr[j] == sum){
                    return new int[]{i,j};
                }
            }
        }

        // return -1,-1 if not exist
        return new int[]{-1,-1};
    }

    public static int[] getTwoSumIndex_Optimized(int arr[], int sum){

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Iterate
        for(int i=0; i<arr.length; i++){
            int complement = sum - arr[i];

            // check in hashmap if complement is there
            if(hm.containsKey(complement)){
                return new int[]{hm.get(complement),i};
            }
            // If complement is not in hm then put the elements
            hm.put(arr[i], i);
        }

        // return -1,-1 if not exist
        return new int[]{-1,-1};
    }
    
    public static void main(String[] args) {
        int arr[] = {1,24,3,6,765,64};
        int sum = 65;

        // Time Complexity - O(n^2)
        System.out.println("BruteForce: "+Arrays.toString(getTwoSumIndex_BruteForce(arr, sum)));

        // Time Complexity - O(n)
        System.out.println("Optimized: "+Arrays.toString(getTwoSumIndex_Optimized(arr, sum)));
    }
}
