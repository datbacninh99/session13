package b13;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Khai báo và khởi tạo một đối tượng TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>(); // Khởi tạo một TreeMap để lưu trữ các cặp key-value

        // Đưa các phần tử vào TreeMap
        treeMap.put(3, "Ba"); // Thêm cặp key-value (3, "Ba") vào treeMap
        treeMap.put(2, "Hai"); // Thêm cặp key-value (2, "Hai") vào treeMap
        treeMap.put(1, "Một"); // Thêm cặp key-value (1, "Một") vào treeMap

        // Lấy giá trị của phần tử nhỏ nhất trong TreeMap
        System.out.println("Phần tử nhỏ nhất trong TreeMap là: " + treeMap.firstEntry()); // In ra cặp key-value nhỏ nhất trong treeMap
    }
}