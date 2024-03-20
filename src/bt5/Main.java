package bt5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Khai báo một HashMap
        HashMap<String, Integer> hashMap = new HashMap<>(); // Khởi tạo một HashMap để lưu trữ các cặp key-value
        hashMap.put("A", 10); // Thêm cặp key-value ("A", 10) vào hashMap
        hashMap.put("B", 5); // Thêm cặp key-value ("B", 5) vào hashMap
        hashMap.put("C", 12); // Thêm cặp key-value ("C", 12) vào hashMap
        hashMap.put("D", 7); // Thêm cặp key-value ("D", 7) vào hashMap

        // Tạo một danh sách các cặp key-value từ HashMap
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hashMap.entrySet()); // Tạo một LinkedList từ tập hợp các entry của hashMap

        // Sắp xếp danh sách theo giá trị tăng dần
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() { // Sắp xếp danh sách list dựa trên giá trị của các entry
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) { // Định nghĩa cách so sánh giữa hai entry
                return (o1.getValue()).compareTo(o2.getValue()); // So sánh giá trị của hai entry
            }
        });

        // Duyệt qua danh sách đã sắp xếp và in ra các phần tử
        HashMap<String, Integer> sortedHashMap = new LinkedHashMap<>(); // Khởi tạo một LinkedHashMap để lưu trữ các entry đã sắp xếp
        for (Map.Entry<String, Integer> entry : list) { // Duyệt qua từng entry trong list
            sortedHashMap.put(entry.getKey(), entry.getValue()); // Thêm entry vào sortedHashMap
        }

        System.out.println("HashMap sau khi đã sắp xếp là: " + sortedHashMap); // In ra sortedHashMap
    }
}