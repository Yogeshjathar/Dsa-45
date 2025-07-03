
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] getTwoSumIndex_BruteForce(int arr[], int sum){

        for(int i=0; i<arr.length-2; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[i]+arr[j] == sum){
                    return new int[]{i,j};
                }
            }
        }


        return new int[]{-1,-1};
    }

    public static int[] getTwoSumIndex_Optimized(int arr[], int sum){

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int complement = sum - arr[i];
            if(hm.containsKey(complement)){
                return new int[]{hm.get(complement),i};
            }
            hm.put(arr[i], i);
        }


        return new int[]{-1,-1};
    }
    
    public static void main(String[] args) {
        int arr[] = {1,24,3,6,765,64};
        int sum = 30;

        // Time Complexity - O(n^2)
        System.out.println("BruteForce: "+Arrays.toString(getTwoSumIndex_BruteForce(arr, sum)));

        // Time Complexity - O(n)
        System.out.println("Optimized: "+Arrays.toString(getTwoSumIndex_Optimized(arr, sum)));
    }
}
