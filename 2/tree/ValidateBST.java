package tree;

public class ValidateBST {
    
    
	class TreeNode{
		
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data){
			this.val = data;
		}
	}

    public boolean isValidBST(TreeNode root) {
        if(root.left==null && root.right==null)
            return true;

        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validateBST(TreeNode root, long min, long max){
        if(root==null)
            return true;
        if(root.val<=min || root.val>=max)
            return false;
        return validateBST(root.left, min, root.val) && validateBST(root.right, root.val, max);
    }
}