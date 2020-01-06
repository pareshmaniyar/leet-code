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
        return postOrderTraversal(root);
    }
    List<List<Integer>> postOrderTraversal(TreeNode n){
        List<List<Integer>> root = new ArrayList<List<Integer>>();
        if(n == null) return root;
        if(n!= null && n.left != null){
            List<List<Integer>> left = postOrderTraversal(n.left);
            for(List list: left){
                root.add(list);
            }
        }
        
        if(n!= null && n.right != null){
            List<List<Integer>> right = postOrderTraversal(n.right);
            int rightSize = right.size() - 1;
            int rootSize = root.size() - 1;
            for(int i = 0; i < rightSize - rootSize; i++){
                root.add(i, right.get(i));
            }
            System.out.println("temp2: " + (rightSize - rootSize) + ", rightSize: " + rightSize);
            for(int i = rightSize - rootSize; i <= rightSize; i++){
                List<Integer> temp = new ArrayList<Integer>();
                temp.addAll(root.get(rootSize + rightSize - i));
                temp.addAll(right.get(i));
                System.out.println("temp: ");
                root.add(i, temp);
            }
        }
        
        List<Integer> val = new ArrayList<Integer>();
        val.add(n.val);
        root.add(val);
        return root;
    }
}
