import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Z", 33);
        hm.put("I", 99);
        hm.put("A", 22);
        hm.put("B", 55);
        hm.put("X", 88);
        hm.put("M", 44);

        // Sort by keys
        TreeMap<String, Integer> sortByKeys = new TreeMap<>(hm);
        System.out.println("Sort By Keys : "+sortByKeys);

        TreeMap<Integer, String> sortByValues = new TreeMap<>();

        for(Map.Entry<String, Integer> e : hm.entrySet()){
            sortByValues.put(e.getValue(), e.getKey());
        }
        System.out.println("Sort By Values : "+sortByValues);

    }
}