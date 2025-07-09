import java.util.Arrays;

public class KthSmallestElement{
    public static void main(String[] args) {
        int num1[] = {2, 3, 6, 7, 9};
        int num2[] = {1,4,8,10};
        int k=7;

        int n1 = num1.length;
        int n2 = num2.length;
        System.out.println("BruteForec: "+getKthSmallest_BruteForec(num1, num2, n1, n2, k));
        System.out.println("Better: "+getKthSmallest_Better(num1, num2, n1, n2, k));
        System.out.println("Optimized: "+getKthSmallest_Optimized1(num1, num2, n1, n2, k));
        System.out.println("Optimized: "+getKthSmallest_Optimized2(num1, num2, n1, n2, k));
    }

    // Time Complexity: O(n1+n2) * log(n1+n2)
    // Space Complexity: O(n1+n2)
    public static int getKthSmallest_BruteForec(int num1[],int num2[], int n1, int n2,int k){
        if(k < 0 || k > n1+n2) return -1;

        int merge[] = new int[n1+n2];
        int idx = 0;
        for(int n : num1){
            merge[idx++] = n;
        }

        for(int n : num2){
            merge[idx++] = n;
        }

        Arrays.sort(merge);
        // for(int n : merge){
        //     System.out.print(n+", ");
        // }

        return merge[k-1];
    }

    // Time Complexity: O(n1+n2)
    // Space Complexity: O(n1+n2)
    public static int getKthSmallest_Better(int num1[],int num2[], int n1, int n2,int k){
        if(k < 0 || k > n1+n2) return -1;
        
        int i = 0;
        int j = 0;
        int idx = 0;
        int merge[] = new int[n1+n2];

        while(i < n1 && j < n2){
            if(num1[i] <= num2[j]){
                merge[idx++] = num1[i++];
            }else{
                merge[idx++] =  num2[j++];
            }
        }

        while(i < n1){
            merge[idx++] = num1[i++];
        }

        while(j < n2){
            merge[idx++] =  num2[j++];
        }

        return merge[k-1];
    }

    // Time Complexity: O(n1+n2)
    // Space Complexity: O(1)
    public static int getKthSmallest_Optimized1(int num1[],int num2[], int n1, int n2,int k){
        if(k < 0 || k > n1+n2) return -1;
        
        int i = 0;
        int j = 0;
        int count=0;

        while(i < n1 && j < n2){
            int val;
            if(num1[i] <= num2[j]){
                val = num1[i];
                i++;
            }else{
                val = num2[j];
                j++;
            }
            
            count++;
            if(count == k) return val;
        }

        while(i < n1){
            count++;
            if(count == k) return num1[i];
            i++;
        }

        while(j < n2){
            count++;
            if(count == k) return num2[j];
            j++;
        }

        return -1;
    }

    // Time Complexity: O(log(min(n1,n2))
    // Space Complexity: O(1)
    public static int getKthSmallest_Optimized2(int num1[],int num2[], int n1, int n2,int k){

        if(n1 > n2) return getKthSmallest_Optimized2(num2, num1, n2, n1, k); // Take a smaller array

        int low = Math.max(0, k-n2);
        int high = Math.min(k, n1);

        while(low <= high){
            int cut1 = low + (high - low) / 2;
            int cut2 = k - cut1;

            int l1 = (cut1==0) ? Integer.MIN_VALUE : num1[cut1-1];
            int l2 = (cut2==0) ? Integer.MIN_VALUE : num2[cut2-1];
            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : num1[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : num2[cut2];

            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1,l2);
            }else if(l1 > r2){
                high = cut1 - 1;
            }else{
                low = cut1 + 1;
            }
        }

        return -1;
    }
}