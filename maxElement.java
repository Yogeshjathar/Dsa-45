public class maxElement {
    public static int getMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max,arr[i]);
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,91,12,57};
        System.out.println(getMax(arr));
    }
}
