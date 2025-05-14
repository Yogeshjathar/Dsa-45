public class reverseArray {

    public static void getReverseArray_BruteForce(int arr[]){
        int rev[] = new int[arr.length];
        int n = arr.length;

        for(int i=0; i<n; i++){
            rev[i] = arr[n-i-1];
        }

        for(int i=0; i<rev.length; i++){
            System.out.print(rev[i]+( i < rev.length-1 ? " ,":""));
        }
    }

    public static void getReverseArray(int arr[]){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int arr[] =  {10, 54, 23, 89, 97, 2};

        // getReverseArray_BruteForce(arr);

        getReverseArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+( i < arr.length-1 ? " ,":""));
        }
    }
}