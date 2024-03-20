package bt10;

class Node {
    int key; // giá trị của nút
    Node left, right; // con trỏ đến nút con bên trái và phải

    // Hàm khởi tạo cho lớp Node
    public Node(int item) {
        key = item; // gán giá trị cho nút
        left = right = null; // khởi tạo nút con bên trái và phải là null
    }
}