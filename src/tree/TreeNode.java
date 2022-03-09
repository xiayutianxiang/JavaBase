package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    public int deep;

    public TreeNode() {
    }

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        qianxuFeiDiGui(node1);
    }

    /*
     *递归前序遍历，中序遍历、后序遍历只需要调换输出节点的位置。
     * @param treeNode
     * @return
     */
    public static void qianxuDiGui(TreeNode treeNode) {

        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.val);
        qianxuDiGui(treeNode.left);
        qianxuDiGui(treeNode.right);
    }

    public static void cengxu(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        cengxu(treeNode.left);
        cengxu(treeNode.right);
    }

    /**
     * 使用栈实现非递归遍历
     *      每次添加结点到栈内，
     * @param treeNode
     */
    public static void qianxuFeiDiGui(TreeNode treeNode) {
        if (treeNode != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.add(treeNode);
            while (!stack.isEmpty()) {
                TreeNode root = stack.pop();
                if (root != null) {
                    System.out.println(root.val);
                    stack.push(root.right);
                    stack.push(root.left);      //要先打出左边的，所以左边的后入栈
                }
            }
        }
    }
}
