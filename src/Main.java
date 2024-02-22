import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> treeNode2 = new TreeNode<>(2);
        TreeNode<Integer> treeNode3 = new TreeNode<>(3);
        TreeNode<Integer> treeNode4 = new TreeNode<>(4);
        TreeNode<Integer> treeNode5 = new TreeNode<>(5);
        TreeNode<Integer> treeNode6 = new TreeNode<>(6);

        GenericTree<Integer> tree = new GenericTree<>(root);

        root.addChildren(treeNode2);
        root.addChildren(treeNode3);
        root.addChildren(treeNode4);
        root.addChildren(treeNode5);
        root.addChildren(treeNode6);

        root.removeChildren(treeNode2);

        List<TreeNode<Integer>> rootChildren = root.getChildren();
        System.out.println("Root: " + root.getData());
        for (TreeNode<Integer> child : rootChildren) {
            System.out.println("Filho: " + child.getData());
        }

        System.out.println("Tem pai? " + (treeNode3.getParent() != null ? "Sim, Pai = " + treeNode3.getParent().getData() : "Não"));
        System.out.println("Tem pai? " + (treeNode2.getParent() != null ? "Sim, Pai = " + treeNode2.getParent().getData() : "Não"));
    }
}