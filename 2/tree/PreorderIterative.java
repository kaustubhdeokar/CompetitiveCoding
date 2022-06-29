package tree;

import java.util.Stack;

public class PreorderIterative {
    public void preorder(TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            TreeNode pop = stack.pop();
            System.out.println(pop.val);
            if (pop.right != null)
                node = pop.right;
        }

    }
}
