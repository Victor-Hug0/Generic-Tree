
import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {

    private T data;
    private List<TreeNode<T>> children;
    private TreeNode<T> parent;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
        this.parent = null;
    }

    public T getData() {
        return data;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }

    public TreeNode<T> getParent() {
        return parent;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setChildren(List<TreeNode<T>> children) {
        this.children = children;
    }

    public void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

    public void addChildren(TreeNode<T> node){
        node.setParent(this);
        children.add(node);
    }

    public void removeChildren(TreeNode<T> node){
        if(children.contains(node)){
            node.setParent(null);
            children.remove(node);
            System.out.println("Nó removido!");
        } else {
            System.out.println("Elemento não é filho desse nó!");
        }
    }
}
