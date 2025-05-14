import java.util.HashSet;

public class CommanElemenets {

    public static void getUnion_BruteForce(int arr1[],int arr2[]){
        // Time complexity - O(n*m)
        // Space complexity - O(1)
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr2[j]+" ");
                    break;
                }
            }
        }
    }

    public static void getUnion_Optimized(int arr1[],int arr2[]){
        // Time complexity - O(n+m)
        // Space complexity - O(n+m)
        HashSet<Integer> hs= new HashSet<>();

        for(int el : arr1){
            hs.add(el);
        }

        for(int el : arr2){
            if(hs.contains(el)){
                System.out.print(el+" ");
                hs.remove(el);
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,4,7,9,2};
        int arr2[] = {1,7,3,4,5};

        System.out.println("Brute force : ");
        getUnion_BruteForce(arr1,arr2);
        System.out.println("\n\nOptimized approach");
        getUnion_Optimized(arr1,arr2);
    }

}