package b15;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo TreeMap và thêm các phần tử
        TreeMap<String, Integer> treeMap = new TreeMap<>(); // Khởi tạo một TreeMap để lưu trữ các cặp key-value
        treeMap.put("A", 1); // Thêm cặp key-value ("A", 1) vào treeMap
        treeMap.put("B", 2); // Thêm cặp key-value ("B", 2) vào treeMap
        treeMap.put("C", 3); // Thêm cặp key-value ("C", 3) vào treeMap

        // In TreeMap ra để kiểm tra
        System.out.println("TreeMap trước khi xóa: " + treeMap); // In ra treeMap

        // Thực hiện xóa bằng phương thức remove()
        treeMap.remove("B"); // Xóa phần tử có key là "B" khỏi treeMap

        // In ra để kiểm tra
        System.out.println("TreeMap sau khi xóa: " + treeMap); // In ra treeMap sau khi đã xóa phần tử
    }
}