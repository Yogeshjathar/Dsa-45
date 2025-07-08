import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4}; // output : [[-1, -1, 2], [-1, 0, 1]]
        
        System.out.println("BruteForec: "+getThreeSum_BruteForec(nums));
        System.out.println("Optimized: "+getThreeSum_Optimized(nums));
    }

    public static List<List<Integer>> getThreeSum_BruteForec(int[] nums){
        Set<List<Integer>> st = new HashSet<>();
        int n=nums.length;

        for(int i=0; i<n; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1; j<n; j++){

                int third = -(nums[i] + nums[j]);
                if(set.contains(third)){
                    // Sort and add so that there will be uniques triplet only 
                    List<Integer> tempList = Arrays.asList(nums[i], nums[j], third);
                    tempList.sort(null);
                    st.add(tempList);
                }
                set.add(nums[j]);
            }
        }

    List<List<Integer>> ans = new ArrayList<>(st);
    return ans; 
    }


    // Time complexity: O(n logn) + O(n^2)
    // Space complexity: O(1)
    public static List<List<Integer>> getThreeSum_Optimized(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){

            if(i != 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{ // i.e sum == 0
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
        
    }
}
