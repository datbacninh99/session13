package b11;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Khai báo một mảng các phần tử nguyên
        int[] array = {5, 3, 2, 8, 6, 7, 1, 4}; // Khởi tạo mảng số nguyên

        // Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(); // Khởi tạo một TreeMap để lưu trữ các cặp key-value

        // Sử dụng một vòng lặp để đưa các phần tử của mảng vào TreeMap
        for (int i : array) { // Duyệt qua từng phần tử của mảng
            treeMap.put(i, 0); // Thêm cặp key-value vào treeMap với key là phần tử của mảng và value là 0
        }

        // Kiểm tra kết quả bằng cách in ra các phần tử trong TreeMap
        System.out.println("Các phần tử trong TreeMap sau khi sắp xếp là: " + treeMap.keySet()); // In ra tập hợp các key trong treeMap, tức là các phần tử đã được sắp xếp
    }
}