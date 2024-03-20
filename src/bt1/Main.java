package bt1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 9, 3, 6, 6, 8, 0, 4, 4, 3, 8, 9}; // Khởi tạo mảng số nguyên
        Map<Integer, Integer> map = new HashMap<>(); // Khởi tạo một HashMap để lưu trữ số lần xuất hiện của mỗi số trong mảng

        // Duyệt các phần tử và đưa vào map
        for (int number : arr) { // Duyệt qua từng phần tử của mảng
            if (map.containsKey(number)) { // Kiểm tra xem số đang xét đã có trong map chưa
                // Tồn tại rồi
                map.put(number, map.get(number) + 1); // Nếu số đã có trong map, tăng số lần xuất hiện của nó lên 1
            } else {
                map.put(number, 1); // Nếu số chưa có trong map, thêm nó vào với số lần xuất hiện là 1
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { // Duyệt qua từng entry trong map
            System.out.println("Value : " + entry.getKey() + " | Count : " + entry.getValue()); // In ra số (value) và số lần xuất hiện của nó (count)
        }
    }
}