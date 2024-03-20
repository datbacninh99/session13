package bt4;

class BinaryTree {
    Node root; // Khai báo biến root kiểu Node để lưu trữ nút gốc của cây

    void printPostorder(Node node) { // Hàm printPostorder để duyệt cây theo thứ tự post-order
        if (node == null) // Nếu node là null, kết thúc hàm
            return;

        // Duyệt các cây con bên trái một cách đệ quy
        printPostorder(node.left); // Gọi đệ quy hàm printPostorder cho cây con bên trái

        // Duyệt các cây con bên phải một cách đệ quy
        printPostorder(node.right); // Gọi đệ quy hàm printPostorder cho cây con bên phải

        // Truy cập nút gốc
        System.out.print(node.key + " "); // In ra giá trị của node
    }

    void printPostorder() { // Hàm printPostorder không tham số, gọi hàm printPostorder với tham số là root
        printPostorder(root); // Gọi hàm printPostorder với tham số là root
    }

    public static void main(String[] args) { // Hàm main - điểm khởi đầu của chương trình
        BinaryTree tree = new BinaryTree(); // Khởi tạo một đối tượng BinaryTree
        tree.root = new Node(27); // Khởi tạo nút gốc của cây với giá trị là 27
        tree.root.left = new Node(14); // Khởi tạo nút con bên trái của nút gốc với giá trị là 14
        tree.root.right = new Node(35); // Khởi tạo nút con bên phải của nút gốc với giá trị là 35
        tree.root.left.left = new Node(10); // Khởi tạo nút con bên trái của nút con bên trái của nút gốc với giá trị là 10
        tree.root.left.right = new Node(19); // Khởi tạo nút con bên phải của nút con bên trái của nút gốc với giá trị là 19
        tree.root.right.left = new Node(31); // Khởi tạo nút con bên trái của nút con bên phải của nút gốc với giá trị là 31
        tree.root.right.right = new Node(42); // Khởi tạo nút con bên phải của nút con bên phải của nút gốc với giá trị là 42

        System.out.println("Duyệt theo thứ tự post order: "); // In ra thông báo bắt đầu duyệt cây
        tree.printPostorder(); // Gọi hàm printPostorder để duyệt cây và in ra các giá trị của nút
    }
}