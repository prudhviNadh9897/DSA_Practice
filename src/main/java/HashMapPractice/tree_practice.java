package HashMapPractice;

import Models.DSA.TreeNode;

import java.util.Stack;

public class tree_practice {
    public static void main(String[] args) {
        TreeNode<Integer> t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(10);
        int maxD = maxDepth(t);

        System.out.println("max depth: "+maxD);

        preorderTraversal(t);




    }



    public static int maxDepth(TreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }else{
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth, rightDepth)+1;
        }

    }

    public static void preorderTraversal(TreeNode<Integer> t){

        Stack<TreeNode<Integer>> s = new Stack<>();
        if(t!=null) s.push(t);

        while(!s.empty()){
            TreeNode<Integer> current = s.pop();
            System.out.println(current.value);

            if(current.right!=null) s.push(current.right);
            if(current.left!=null) s.push(current.left);

            }
        }
}
