package bt9;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Khai báo và khởi tạo HashMap
        // HashMap này sẽ lưu trữ các phần tử dưới dạng cặp key-value
        HashMap<String, Integer> hashMap = new HashMap<>(); // Khởi tạo một HashMap để lưu trữ các cặp key-value
        hashMap.put("A", 1); // Thêm cặp key-value ("A", 1) vào hashMap
        hashMap.put("B", 2); // Thêm cặp key-value ("B", 2) vào hashMap
        hashMap.put("C", 3); // Thêm cặp key-value ("C", 3) vào hashMap

        // Kiểm tra xem phần tử có tồn tại trong HashMap hay không
        // Nếu phần tử tồn tại, in ra giá trị của phần tử đó
        // Nếu không, in ra một thông báo cho biết phần tử không tồn tại trong HashMap
        String keyToCheck = "B"; // Khai báo và khởi tạo biến keyToCheck với giá trị là "B"
        if (hashMap.containsKey(keyToCheck)) { // Kiểm tra xem keyToCheck có tồn tại trong hashMap không
            System.out.println("Phần tử " + keyToCheck + " tồn tại trong HashMap với giá trị là: " + hashMap.get(keyToCheck)); // Nếu tồn tại, in ra giá trị của phần tử đó
        } else {
            System.out.println("Phần tử " + keyToCheck + " không tồn tại trong HashMap"); // Nếu không tồn tại, in ra thông báo
        }
    }
}
