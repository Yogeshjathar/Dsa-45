public class SingleEl_SortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};

        System.out.println("Output 1: " + singleNonDuplicate(nums1)); // 2
        System.out.println("Output 2: " + singleNonDuplicate(nums2)); // 10
    }
    public static int singleNonDuplicate(int[] nums) {
        
        /* for(int i=1; i<nums.length-1; i++){
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return -1; */

        int  n=nums.length;
        int st = 0; 
        int end = n-1;

        if(n == 1){ return nums[0];}
        while(st <= end){
            int mid = st + (end - st) / 2;

            if(mid == 0 && nums[0] != nums[1]){ 
                return nums[mid];
            }
            
            if(mid == n-1 && nums[n-2] != nums[n-1]){ 
                return nums[mid];
            }

            // If mid is the unique element
            if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }

            if(mid % 2 == 0){   // even
                if(nums[mid] == nums[mid-1]){
                    end = mid - 1;
                }else{
                    st = mid + 1;
                }
            }else{  // odd
                if(nums[mid-1] == nums[mid]){
                    st = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
