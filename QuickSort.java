public class QuickSort {
    public static void quickSort(int arr[], int si, int ei){
        if(si < ei){
            int piIdx = partition(arr, si, ei);
            quickSort(arr, si, piIdx-1);
            quickSort(arr, piIdx+1, ei);
        }
    }

    public static int partition(int arr[], int si, int ei){
        int idx = si-1, pivot = arr[ei];

        for(int j=si; j<ei; j++){
            if (arr[j] <= pivot) {
                idx++;
                // swap
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }

        idx++;
        int temp = arr[idx];
        arr[idx] = pivot;
        arr[ei] = temp;

        return idx;
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ ",");
        }
        System.out.println();
    }

    public static void main(String strs[]){
        int arr[] = {6,4,2,8,-22,4,9,3};
        quickSort(arr,0,arr.length-1);
        printarr(arr);
    }
}