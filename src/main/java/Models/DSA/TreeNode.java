package Models.DSA;

public class TreeNode<T> {
    public T value;
    public TreeNode<T> left, right;
    public TreeNode<T> node;

    public TreeNode(){

    }

    public TreeNode(T value) {
        this.value = value;
    }

    public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

//    public TreeNode<T> TreeNode(T[] treeArray){
//
//    }


}
