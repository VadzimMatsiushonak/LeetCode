package by.vadzim.LeetCode75.Day6.T589;

import by.vadzim.LeetCode75.model.Node;
import java.util.ArrayList;
import java.util.List;

/**
 * Best results
 * <p>
 * Runtime 0 ms Beats 100%
 * <p>
 * Memory 42.6 MB Beats 91.54%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {

    public List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        Solution solution = new Solution();

        Node node1 = new Node(1, List.of(new Node(3, List.of(new Node(5), new Node(6))), new Node(2), new Node(4)));
        Node node2 = new Node(1, List.of(
            new Node(2),
            new Node(3, List.of(
                new Node(6),
                new Node(7, List.of(
                    new Node(11, List.of(
                        new Node(14))))))),
            new Node(4, List.of(
                new Node(8, List.of(
                    new Node(12))))),
            new Node(5, List.of(
                new Node(9, List.of(
                    new Node(13))),
                new Node(10)))));

        List<Integer> result1 = solution.preorder(node1);
        System.out.println(List.of(1, 3, 5, 6, 2, 4).containsAll(result1) + " result1 = " + result1);

        solution.result = new ArrayList<>();

        List<Integer> result2 = solution.preorder(node2);
        System.out.println(
            List.of(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10).containsAll(result2) + " result2 = " + result2);
    }

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return result;
        }

        result.add(root.val);
        if (root.children != null) {
            for (Node child : root.children) {
                preorder(child);
            }
        }

        return result;
    }

/*
    Solution with Iterative way
    Runtime 3 ms Beats 27.94% Memory 42.6 MB Beats 91.54%

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return result;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            result.add(node.val);

            List<Node> children = node.children;
            if (children != null) {
                for (int i = children.size()-1; i >= 0; i--) {
                    stack.push(children.get(i));
                }
            }
        }

        return result;
    }
*/

}
