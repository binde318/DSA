import java.util.HashMap;
import java.util.Map;

public class HashTable1 {
    public static void main(String[] args) {
        Map<Integer, String> table = new HashMap<>();
        table.put(56, "jack");
        table.put(57, "jack0");
        table.put(58, "jack3");
        table.put(59, "jack9");
        table.put(60, "jack6");
        table.put(61, "jack4");
        for (Integer key : table.keySet()) {
            System.out.println( key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }
}
