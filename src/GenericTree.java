public class GenericTree<T> {

    private TreeNode<T> root;
    private TreeNode<T> treeNode;

    public GenericTree(TreeNode<T> root) {
        this.root = root;
    }

    public GenericTree() {
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public TreeNode<T> getNode() {
        return treeNode;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public void setNode(TreeNode<T> treeNode) {
        this.treeNode = treeNode;
    }
}
