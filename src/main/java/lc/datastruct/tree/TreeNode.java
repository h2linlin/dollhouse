package lc.datastruct.tree;

/**
 * @Desc 二叉树节点
 * @Author h2linlin
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}
    public TreeNode(Integer val) { this.val = val; }
    public TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
