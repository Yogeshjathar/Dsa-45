import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {
        String  strs[] = {"eat","tea","tan","ate","nat","bat"};
        // aet -> "eat","tea","ate"

        System.out.println("BruteForce: " + groupAnagrams_BruteForec(strs));
        System.out.println("Optimized: " + groupAnagrams_Optimized(strs));
    }

    // Time complexity: O(n * k.log k) 
    // Space Complexity: O(n * k)
    public static List<List<String>> groupAnagrams_BruteForec(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(String s : strs){
            char chars[] = s.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            if(!ans.containsKey(key)){
				// When we add new string first time
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }

    // Time complexity: O(n * k)
    // Space Complexity: O(n * k)
    public static List<List<String>> groupAnagrams_Optimized(String[] strs){
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // Create a string key like "#1#0#0#2..." to represent counts
            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append('#').append(num);
            }

            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
