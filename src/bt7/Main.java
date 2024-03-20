package bt7;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Khai báo và khởi tạo HashMap gốc
        HashMap<String, Integer> originalHashMap = new HashMap<>(); // Khởi tạo một HashMap để lưu trữ các cặp key-value
        originalHashMap.put("A", 1); // Thêm cặp key-value ("A", 1) vào originalHashMap
        originalHashMap.put("B", 2); // Thêm cặp key-value ("B", 2) vào originalHashMap
        originalHashMap.put("C", 3); // Thêm cặp key-value ("C", 3) vào originalHashMap

        // Khai báo một HashMap mới và sao chép tất cả các phần tử từ HashMap gốc
        HashMap<String, Integer> copiedHashMap = new HashMap<>(); // Khởi tạo một HashMap mới
        copiedHashMap.putAll(originalHashMap); // Sao chép tất cả các cặp key-value từ originalHashMap vào copiedHashMap

        // Kiểm tra xem HashMap mới đã sao chép chính xác tất cả các phần tử từ HashMap gốc hay chưa
        System.out.println("HashMap gốc: " + originalHashMap); // In ra originalHashMap
        System.out.println("HashMap sau khi sao chép: " + copiedHashMap); // In ra copiedHashMap
    }
}