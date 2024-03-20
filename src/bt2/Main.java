package bt2;

import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 4, 5, 6, 4, 7, 8, 7, 9}; // Khởi tạo mảng số nguyên
        HashMap<Integer, Integer> hashMap = new HashMap<>(); // Khởi tạo một HashMap để lưu trữ số lần xuất hiện của mỗi số trong mảng

        // Duyệt từng phần tử trong mảng
        for (int i : array) { // Duyệt qua từng phần tử của mảng
            if (hashMap.containsKey(i)) { // Kiểm tra xem số đang xét đã có trong hashMap chưa
                hashMap.put(i, hashMap.get(i) + 1); // Nếu số đã có trong hashMap, tăng số lần xuất hiện của nó lên 1
            } else {
                hashMap.put(i, 1); // Nếu số chưa có trong hashMap, thêm nó vào với số lần xuất hiện là 1
            }
        }

        // Duyệt qua các phần tử trong HashMap
        ArrayList<Integer> uniqueElements = new ArrayList<>(); // Khởi tạo một ArrayList để lưu trữ các phần tử duy nhất
        for (int i : hashMap.keySet()) { // Duyệt qua từng key trong hashMap
            if (hashMap.get(i) == 1) { // Kiểm tra xem số lần xuất hiện của key đó có bằng 1 không
                uniqueElements.add(i); // Nếu số lần xuất hiện bằng 1, thêm key đó vào ArrayList
            }
        }

        // In ra các phần tử duy nhất
        System.out.println("Các phần tử duy nhất trong mảng là: " + uniqueElements); // In ra các phần tử duy nhất trong mảng
    }
}