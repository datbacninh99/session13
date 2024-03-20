package bt14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng ngẫu nhiên 100 phần tử
        Random random = new Random(); // Khởi tạo một đối tượng Random

        int[] arr = new int[100]; // Khởi tạo một mảng số nguyên có 100 phần tử
        for (int i = 0; i < 100; i++) { // Lặp lại 100 lần
            // Với mỗi 1 phần tử trong mảng, tạo ra giá trị ngẫu nhiên
            arr[i] = random.nextInt(100); // Gán giá trị ngẫu nhiên từ 0 đến 99 cho phần tử thứ i của mảng
        }

        // Tìm giá trị lớn thứ 2 trong mảng
        // Tree Map
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder()); // Khởi tạo một TreeMap để lưu trữ các cặp key-value, sắp xếp theo thứ tự giảm dần

        for (int number : arr) { // Duyệt qua từng phần tử của mảng
            if (map.containsKey(number)) { // Kiểm tra xem số đang xét đã có trong map chưa
                // Tồn tại rồi
                map.put(number, map.get(number) + 1); // Nếu số đã có trong map, tăng số lần xuất hiện của nó lên 1
            } else {
                map.put(number, 1); // Nếu số chưa có trong map, thêm nó vào với số lần xuất hiện là 1
            }
        }
        System.out.println(map); // In ra map
        System.out.println(Arrays.toString(arr)); // In ra mảng arr
        Integer max = map.lastKey(); // Lấy ra key lớn nhất trong map
        Integer secondMax = map.lowerKey(max); // Lấy ra key lớn thứ hai trong map
        Integer thirstMax = map.lowerKey(secondMax); // Lấy ra key lớn thứ ba trong map
        System.out.println("Giá trị lớn thứ 2 = " + secondMax + " | Số phần tử lớn thứ 2 = " + map.get(secondMax)); // In ra giá trị lớn thứ 2 và số lần xuất hiện của nó

        // Tìm kiếm phần tử lớn thứ n trong mảng
        int n = 8; // Khởi tạo biến n với giá trị là 8
        for (int i = 0; i < n - 1; i++) { // Lặp lại n - 1 lần
            max = map.lowerKey(max); // Lấy ra key lớn thứ n trong map
        }
        System.out.println("Giá trị lớn thứ " + n + " = " + max + " | Số phần tử cùng giá trị = " + map.get(max)); // In ra giá trị lớn thứ n và số lần xuất hiện của nó
    }
}