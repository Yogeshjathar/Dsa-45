import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Z", 33);
        hm.put("I", 99);
        hm.put("A", 22);
        hm.put("B", 55);
        hm.put("X", 88);
        hm.put("M", 44);

      

        System.out.println("\nIterating using for-each loop :");
        for(Map.Entry<String,Integer> el : hm.entrySet()){
            System.out.println(el);
        }

        // keyset() iterator
        System.out.println("\nIterating using KeySet :");
        Iterator<String> it = hm.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key+" : "+hm.get(key));
        }
        
        // entrySet() and for loop
        System.out.println("\nIterating using EntrySet and For-Loop :");
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        // entrySet() and java iterator
        System.out.println("\nIterating using EntrySet and Iterator :");
        Iterator<Map.Entry<String,Integer>> it2 = hm.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, Integer> entry = it2.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
