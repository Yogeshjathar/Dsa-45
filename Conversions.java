import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Conversions {
    public static void main(String[] args) {

        // ArrayList to LinkedList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Amazon");
        list.add("Facebook");
        list.add("Google");
        list.add("IBM");
        list.add("Tesla");

        // System.out.println(list);
        System.out.println("ArrayList to LinkedList :");
        LinkedList<String> ll = new LinkedList<>(list);
        System.out.println(ll);

        // LinkedList to ArrayList
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("AWS");
        ll2.add("GCP");
        ll2.add("Microsoft azure");
        ll2.add("Firebase");
        // System.out.println("\nCurrent ll : \n"+ll2);
        ArrayList<String> list2 = new ArrayList<>(ll2);
        System.out.println("\nLinkedList to ArrayList : \n"+list2);


        // HashSet to ArrayList
        HashSet<String> hs = new HashSet<>();
        hs.add("AWS");
        hs.add("GCP");
        hs.add("Microsoft azure");
        hs.add("Firebase");

        ArrayList<String> ha = new ArrayList<>(hs);
        System.out.println("\nHashSet to ArrayList : \n"+ha);

        // ArrayList to String
        String arr[] = list.toArray(new String[0]);
        System.out.println("\nArrayList to String : ");
        for(String e : arr){
            System.out.print(e+", ");
        }

        // Array to ArrayList
        String arr2[] = {"Adity","Sujit","Shubham"};
        ArrayList<String> aal = new ArrayList<>(Arrays.asList(arr2));
        System.out.print("\n\nArray to ArrayList : \n"+aal);

        // Sort ArrayList in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}