/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        return postOrderTraversal(root, 0);
    }
    List<List<Integer>> postOrderTraversal(TreeNode n, int level){
        
        List<List<Integer>> root = new ArrayList<List<Integer>>();
        if(n.left != null){
            List<List<Integer>> left = new ArrayList<List<Integer>>();
            for(List list: left){
                root.add(left);
            }
        }
        
        List<List<Integer>> right = new ArrayList<List<Integer>>();
        if(n.right != null){
            List<List<Integer>> right = new ArrayList<List<Integer>>();
            for(List list: right){
                root.add(right);
            }
        }
        
        List<Integer> val = new ArrayList<Integer>();
        val.add(n.val);
        l1.add(val);
        return root;
    }
}
