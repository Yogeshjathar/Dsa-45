import java.util.Map;
import java.util.TreeMap;

public class IterateTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();

        tm.put("Z", 33);
        tm.put("I", 99);
        tm.put("A", 22);
        tm.put("B", 55);
        tm.put("X", 88);
        tm.put("M", 44);

        for(Map.Entry<String,Integer> entry : tm.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}