public class Sort {

    public static void BubbleSort(int arr[],int n){
        
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[],int n){
        for(int i=0; i<arr.length; i++){
            int smallestIndex=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    public static void InsertionSort(int arr[],int n){

        for(int i=0; i<n; i++){
            int j=i;
            while(j > 0 && arr[j-1] > arr[j]){
                // Swap
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                // Decrement j
                j--;
            }
        }
    }

    

    public static void  printArr(int arr[],String message){
        System.out.println(message+" :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int arr1[] = {5,2,45,98,35,87,32,22};
        int arr2[] = {45,98,35,87,32,22};
        int arr3[] = {1,9,2,5,8,7};

        // Bubble Sort - Time complexity - O(n^2) and Space Complexity - O(1)
        BubbleSort(arr1, arr1.length);
        printArr(arr1,"BubbleSort");

        // Selection Sort - Time complexity - O(n^2) and Space Complexity - O(1)
        SelectionSort(arr2, arr2.length);
        printArr(arr2,"SelectionSort");

        // Insertion Sort - Time complexity - O(n^2) and Space Complexity - O(1)
        InsertionSort(arr3, arr3.length);
        printArr(arr3,"InsertionSort");
    }
}
