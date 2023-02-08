package by.vadzim.LeetCode75.Day6.T102;

import by.vadzim.LeetCode75.model.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Best results
 * <p>
 * Runtime 0 ms Beats 100%
 * <p>
 * Memory 42.1 MB Beats 96.26%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode node = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        List<List<Integer>> result = solution.levelOrder(node);
        System.out.println("[[3], [9, 20], [15, 7]]".equals(result.toString()) + " result = " + result);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        List<Integer> currentLevelValues = new ArrayList<>();

        while (!nodeQueue.isEmpty()) {
            int length = nodeQueue.size();
            for (int i = 0; i < length; i++) {
                TreeNode current = nodeQueue.poll();
                currentLevelValues.add(current.val);
                if (current.left != null) {
                    nodeQueue.add(current.left);
                }
                if (current.right != null) {
                    nodeQueue.add(current.right);
                }
            }
            result.add(currentLevelValues);
            currentLevelValues = new ArrayList<>();
        }

        return result;
    }

/*
    First implementation
    Runtime 1 ms Beats 76.58% Memory 42.3 MB Beats 82.27%
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        List<TreeNode> currentLevelNodes = List.of(root);
        List<TreeNode> nextLevelNodes = new ArrayList<>();
        List<Integer> currentLevelValue = new ArrayList<>();

        while (!currentLevelNodes.isEmpty()) {
            for (TreeNode node : currentLevelNodes) {
                currentLevelValue.add(node.val);
                if (node.left != null)
                    nextLevelNodes.add(node.left);
                if (node.right != null)
                    nextLevelNodes.add(node.right);
            }
            result.add(currentLevelValue);

            currentLevelNodes = nextLevelNodes;
            nextLevelNodes = new ArrayList<>();
            currentLevelValue = new ArrayList<>();
        }

        return result;
    }
*/


}
