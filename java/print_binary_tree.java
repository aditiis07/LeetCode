// ======================================
// LeetCode Problem: print binary tree
// Language: java
// Link: https://leetcode.com/problems/print-binary-tree/
// Synced by: LinkCode
// Date: 25/8/2026, 10:25:20 pm
// ======================================


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<String>> printTree(TreeNode root) {
        
        int height = getHeight(root);
                
                        int rows = height + 1;
                                int cols = (1 << rows) - 1;
                                        
                                                List<List<String>> res = new ArrayList<>();
                                                        
                                                                for (int i = 0; i < rows; i++) {
                                                                            List<String> row = new ArrayList<>();
                                                                                        
                                                                                                    for (int j = 0; j < cols; j++) {
                                                                                                                    row.add("");
                                                                                                                                }
                                                                                                                                            
                                                                                                                                                        res.add(row);
                                                                                                                                                                }
                                                                                                                                                                        
                                                                                                                                                                                fill(res, root, 0, 0, cols - 1);
                                                                                                                                                                                        
                                                                                                                                                                                                return res;
                                                                                                                                                                                                    }
                                                                                                                                                                                                        
                                                                                                                                                                                                            private int getHeight(TreeNode root) {
                                                                                                                                                                                                                    if (root == null) {
                                                                                                                                                                                                                                return -1;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                        return 1 + Math.max(
                                                                                                                                                                                                                                                                    getHeight(root.left),
                                                                                                                                                                                                                                                                                getHeight(root.right)
                                                                                                                                                                                                                                                                                        );
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                    private void fill(
                                                                                                                                                                                                                                                                                                            List<List<String>> res,
                                                                                                                                                                                                                                                                                                                    TreeNode root,
                                                                                                                                                                                                                                                                                                                            int row,
                                                                                                                                                                                                                                                                                                                                    int left,
                                                                                                                                                                                                                                                                                                                                            int right
                                                                                                                                                                                                                                                                                                                                                ) {
                                                                                                                                                                                                                                                                                                                                                        if (root == null) {
                                                                                                                                                                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                                                            int mid = (left + right) / 2;
                                                                                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                                                                            res.get(row).set(mid, String.valueOf(root.val));
                                                                                                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                                                                                            fill(res, root.left, row + 1, left, mid - 1);
                                                                                                                                                                                                                                                                                                                                                                                                                                    fill(res, root.right, row + 1, mid + 1, right);
    }
}