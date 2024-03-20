import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        // Thao tác them key - value
        map.put("SV001", "Nguyễn Văn A");
        map.put("SV002", "Nguyễn Văn B");
        map.put("SV003", "Nguyễn Văn C");
        map.put("SV004", "Nguyễn Văn D");
        map.put("SV005", "Nguyễn Văn G");
        map.put("SV006", "Nguyễn Văn F");
//        map.put(null,null);
//        map.put(null,null);
        System.out.println(map);

        // Xóa theo key
        map.remove("SV001");
        System.out.println(map);

        // Truy xuất giá trị theo key
        System.out.println(map.get("SV002"));

        // Kiểm tra tồn tại theo key
        System.out.println(map.containsKey("SV002"));

        // Key set
        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        // Entry: key - value
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            // Làm việc với key - value
            System.out.printf("Key : %10s | Value : %20s\n", entry.getKey(), entry.getValue());
        }

        // Có key = S004
        System.out.println(map.lowerKey("SV004"));
    }
}