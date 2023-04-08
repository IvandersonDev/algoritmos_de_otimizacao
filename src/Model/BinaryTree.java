package Model;

public class BinaryTree {
    TreeNode root;

    public void insert(int val) {
        root = insert(root, val);
    }

    private TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public boolean search(int val) {
        return search(root, val);
    }

    private boolean search(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            return true;
        } else if (val < root.val) {
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }

    public void inserir(int val) {
        insert(val);
    }

    public String emOrdem() {
        StringBuilder sb = new StringBuilder();
        emOrdem(root, sb);
        return sb.toString();
    }

    private void emOrdem(TreeNode root, StringBuilder sb) {
        if (root != null) {
            emOrdem(root.left, sb);
            sb.append(root.val).append(" ");
            emOrdem(root.right, sb);
        }
    }

}

