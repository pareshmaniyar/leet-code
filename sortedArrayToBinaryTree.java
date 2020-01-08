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
    public TreeNode sortedArrayToBST(int[] nums) {
        //n < 2
        int n = nums.length;
        if(n == 0) return null;
        if(n == 1) {
            TreeNode nums1 = new TreeNode(nums[0]);
            return nums1;
        }
        if(n == 2 || n == 3) {
            TreeNode nums2 = new TreeNode(nums[1]);
            TreeNode left = new TreeNode(nums[0]);
            nums2.left = left;
            if(n == 3) {
                TreeNode right = new TreeNode(nums[2]);
                nums2.right = right;
            }
            return nums2;
        }
        TreeNode res = new TreeNode(nums[n/2]);
        res.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, n/2));
        res.right = sortedArrayToBST(Arrays.copyOfRange(nums, (n/2) + 1, n));
        return res;
    }
}

