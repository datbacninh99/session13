package bt8;

class Node {
    int key; // Khai báo biến key kiểu int để lưu trữ giá trị của node
    Node left, right; // Khai báo hai biến left và right kiểu Node để lưu trữ tham chiếu đến node con bên trái và bên phải

    public Node(int item) { // Constructor của class Node với tham số đầu vào là một số nguyên
        key = item; // Gán giá trị của tham số đầu vào cho biến key
        left = right = null; // Khởi tạo giá trị ban đầu cho left và right là null, tức là node này chưa có node con nào
    }
}