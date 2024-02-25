import java.util.List;

public class GenericTree<T> {

    private TreeNode<T> root;

    public GenericTree(T rootData) {
        this.root = new TreeNode<>(rootData);
    }

    public void insert(T parentData, T data){
        TreeNode<T> parentNode = findNode(root, parentData);
            if (parentNode != null){
                parentNode.getChildren().add(new TreeNode<>(data));
            } else {
                System.out.println("Parent node not found!");
            }
    }

    public void remove(T data){
        if (root != null && root.getData().equals(data)){
            System.out.println("Cannot remove root node!");
        } else {
            removeNode(root, data);
        }
    }

    private void removeNode(TreeNode<T> currentNode, T data){
        List<TreeNode<T>> children = currentNode.getChildren();
        for (int i = 0; i < children.size(); i++){
            TreeNode<T> child = children.get(i);
            if (child.getData().equals(data)){
                children.remove(i);
                return;
            } else {
                removeNode(child, data);
            }
        }
    }

    private TreeNode<T> findNode(TreeNode<T> currentNode, T data){
        if (currentNode.getData().equals(data)){
            return currentNode;
        } else {
            for (TreeNode<T> child : currentNode.getChildren()){
                TreeNode<T> foundNode = findNode(child, data);
                if (foundNode != null){
                    return foundNode;
                }
            }
            return null;
        }
    }

    public void traverse(){
        System.out.println("Tree trasnversal: ");
        printTree(root, "");
    }

    private void printTree(TreeNode<T> currentNode, String prefix){
        if (currentNode != null){
            System.out.println(prefix + "└─ " + currentNode.getData());
            List<TreeNode<T>> children = currentNode.getChildren();
            for (int i = 0; i < children.size() - 1; i++){
                printTree(children.get(i), prefix + "   │");
            }
            if(!children.isEmpty()){
                printTree(children.getLast(), prefix + "    ");
            }
        }
    }

}
