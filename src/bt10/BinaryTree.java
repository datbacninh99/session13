package bt10;

class BinaryTree {
    Node root; // Nút gốc của cây

    // Hàm tìm kiếm một phần tử trong cây nhị phân
    boolean search(Node node, int key) {
        // Nếu cây con trống hoặc phần tử tìm thấy khớp với current.element
        if (node == null || node.key == key)
            return true;

        // Nếu element lớn hơn current.element, gán current.right cho current
        if (node.key < key)
            return search(node.right, key);

        // Nếu element nhỏ hơn current.element, gán current.left cho current
        return search(node.left, key);
    }

    // Hàm main để thực hiện chương trình
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // Tạo một cây nhị phân mới
        tree.root = new Node(27); // Tạo nút gốc với giá trị là 27
        tree.root.left = new Node(14); // Tạo nút con bên trái của nút gốc với giá trị là 14
        tree.root.right = new Node(35); // Tạo nút con bên phải của nút gốc với giá trị là 35
        tree.root.left.left = new Node(10); // Tạo nút con bên trái của nút "14" với giá trị là 10
        tree.root.left.right = new Node(19); // Tạo nút con bên phải của nút "14" với giá trị là 19
        tree.root.right.left = new Node(31); // Tạo nút con bên trái của nút "35" với giá trị là 31
        tree.root.right.right = new Node(42); // Tạo nút con bên phải của nút "35" với giá trị là 42

        int keyToSearch = 19; // Khai báo phần tử cần tìm
        // Kiểm tra xem phần tử có tồn tại trong cây nhị phân hay không
        if (tree.search(tree.root, keyToSearch))
            System.out.println("Phần tử " + keyToSearch + " tồn tại trong BST");
        else
            System.out.println("Phần tử " + keyToSearch + " không tồn tại trong BST");
    }
}