import java.util.ArrayList;

public class UnionArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;

        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is : ");

        for (int val: Union){
            System.out.print(val+", ");
        }
    }

    public static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
        int i=0, j=0;
        ArrayList<Integer> union = new ArrayList<>();

        while (i < n && j < m) { 
            if(arr1[i] <= arr2[j]){
                if(union.size() == 0 || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }else{
                if(union.size() == 0 || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < n){
            if(union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
            }
            i++;
        }

        while(j < m){
            if(union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
}
