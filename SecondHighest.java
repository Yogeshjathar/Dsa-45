public class SecondHighest {

    public static int getSecondHighest(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondMax = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }

            if(secondMax < arr[i] && arr[i] < max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int arr[] = {12,42,45,75,85,80,22,3};
        System.out.println(getSecondHighest(arr));
    }
}
