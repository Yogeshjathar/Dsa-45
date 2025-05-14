
import java.util.ArrayList;

public class reverseArrayList {

    public static void getReverseArrayList(ArrayList<String> list){
        int first = 0;
        int last = list.size()-1;

        while(first<last){
            String temp = list.get(first);
            list.set(first, list.get(last));
            list.set(last, temp);
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //  [Apple, Amazon, Facebook, Google, IBM, Tesla]
        list.add("Apple");
        list.add("Amazon");
        list.add("Facebook");
        list.add("Google");
        list.add("IBM");
        list.add("Tesla");
        
        System.err.println(list);
        getReverseArrayList(list);
        System.out.println(list);
    }
}
