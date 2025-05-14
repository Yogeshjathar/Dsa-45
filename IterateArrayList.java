import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Amazon");
        list.add("Facebook");
        list.add("Google");
        list.add("IBM");
        list.add("Tesla");

        System.out.println("Iterating using simple for loop :");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+", ");
        }

        System.out.println("\n\nIterating using for-each loop :");
        for(String l : list){
            System.out.print(l+", ");
        }

        System.out.println("\n\nIterating using while loop :");
        int index = 0;
        while (index < list.size()) { 
            System.out.print(list.get(index)+", ");
            index++;
        }

        System.out.println("\n\nIterating using Iterator :");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }

        System.out.println("\n\nIterating using stream :");
        // list.stream().forEach(System.out::print);
        list.stream().forEach(l -> System.out.print(l+" "));

        System.out.println("\n");
        LinkedList<String> ll = new LinkedList<>(list);
        System.out.println(ll);

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("AWS");
        ll2.add("GCP");
        ll2.add("Microsoft azure");
        ll2.add("Firebase");
        System.out.println("\nCurrent ll : \n"+ll2);
        ArrayList<String> list2 = new ArrayList<>(ll2);
        System.out.println("\nll to ArrayList : \n"+list2);
    }
}