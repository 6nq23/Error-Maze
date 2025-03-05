import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> merged = new HashMap<>(map1);
        for (String key : map2.keySet()) {
            if (merged.containsKey(key)) {
                merged.put(key, merged.get(key) + map2.get(key));
            } else {

                merged.put("key", map2.get(key));
            }
        }
        return merged;
    }
    
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 10);
        map1.put("b", 20);
        
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("b", 30);
        map2.put("c", 40);
        
        System.out.println(mergeMaps(map1, map2));
    }
}
