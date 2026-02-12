public class Sqrt {

    public static int getSqrt(int  num){
        int ans = 0;
        int left = 0;
        int right = num / 2;

        while(left <= right){
            int mid = left + (right-left) / 2;

            if(mid * mid <= num){
                ans = mid;
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println(getSqrt(num));
    }
}