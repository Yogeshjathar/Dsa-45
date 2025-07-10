
public class Max_SubArraySum {
    public static void main(String arg[]){
        int number[] = {-2,-3,4,-1,-2,1,5,-3};

        max_subarrays(number);
        max_subarrays_prefix(number); // int number[] = {1,-2,6,-1,3};
        max_subarrays_kadane_s(number);     // int number[] = {-2,-3,4,-1,-2,1,5,-3};
    }

    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    public static void max_subarrays(int numbers[]){
        // brute force
        // number[] = {2,4,6,8,10}
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){

            for(int j=i;j<numbers.length;j++){
                curr_sum = 0;
                for(int k=i;k<=j;k++){
                    curr_sum += numbers[k];
                }
                if(max_sum < curr_sum){
                    max_sum = curr_sum;
                }
            }
        }
        System.out.println("maximum sum of subarrays : "+max_sum);
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void max_subarrays_prefix(int numbers[]){
        // number[] = {1,-2,6,-1,3}
        int curr_sum = 0;   
        int max_sum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1] + numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start= i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                curr_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(max_sum < curr_sum){
                    max_sum = curr_sum;
                }
            }
        }
        System.out.println("maximum sum of subarrays : "+max_sum);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void max_subarrays_kadane_s(int numbers[]){
        /* int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("maximum sum of subarrays Kadane's Algorithm: " + ms); */

        // Use below code in case input consist of -ve elements as well
        int cs = numbers[0];
        int ms = numbers[0];

        for(int i=0; i<numbers.length; i++){
            cs = Math.max(numbers[i], cs + numbers[i]);
            ms = Math.max(cs, ms);
        }
        System.out.println("maximum sum of subarrays Using Kadane's Algorithm: " + ms);
    }
}