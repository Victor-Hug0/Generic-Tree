import com.sun.source.tree.Tree;

import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;

public class Main {
    public static void main(String[] args) {

        GenericTree<String> tree = new GenericTree<>("A");

        tree.insert("A", "B");
        tree.insert("A", "C");

        tree.insert("B", "D");
        tree.insert("C", "E");
        tree.insert("B", "F");

        System.out.println("Original Tree:");
        tree.traverse();

        tree.remove("F");

        System.out.println("Changed tree:");
        tree.traverse();
    }
}