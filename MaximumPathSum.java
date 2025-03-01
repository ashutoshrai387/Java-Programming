/*
Deep within the Mountain of Lumina lies a hidden crystal guarded by a binary tree. Each node of the tree has a number, and the path to the crystal is the one with the maximum sum of node values from the root to any leaf.

Write a program to find the maximum path sum in the tree.

Example:

Input:

tree = { "val": 10, 
             "left": { 
                  "val": 20, 
                  "left": ("val": 15, "left": None, "right": None),            
                  "right": ("val": 25, "left": None, "right": None)
                  }, 
             "right": { 
                  "val": 5, 
                  "left": None, 
                  "right": {"val": 30, "left": None, "right": None)
                  }
        }

Output: 55


Explanation:

The path is 10→20→25, with a sum of 55.

Constraints:

- 1 ≤ number of nodes ≤ 10^4

- Node values are integers between -10^4 and 10^4
 */


class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class MaximumPathSum {

    // Function to find the maximum path sum from root to any leaf
    public static int maxPathSum(TreeNode root) {
        // Call the helper function to get the maximum sum
        return helper(root);
    }
    
    // Helper function to perform DFS and calculate the maximum path sum
    private static int helper(TreeNode node) {
        // Base case: If the node is null, return 0
        if (node == null) {
            return 0;
        }
        
        // Recursively get the maximum path sum of the left and right subtrees
        int leftSum = Math.max(0, helper(node.left));  // If negative, ignore
        int rightSum = Math.max(0, helper(node.right)); // If negative, ignore
        
        // Return the maximum path sum from this node to any leaf
        return node.val + Math.max(leftSum, rightSum);
    }

    public static void main(String[] args) {
        // Example tree: {10, 20, 5, 15, 25, null, 30}
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(25);
        root.right.right = new TreeNode(30);

        // Finding and printing the maximum path sum
        int maxSum = maxPathSum(root);
        System.out.println("Maximum Path Sum: " + maxSum); // Output should be 55
    }
}