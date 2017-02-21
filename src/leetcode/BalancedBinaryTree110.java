package leetcode;

import java.util.List;

public class BalancedBinaryTree110 {

	public boolean isBalanced(Treenode root) {
		if(root == null) return true;
		if (Math.abs(getDepth(root.left) - getDepth(root.right)) >1)
		{
			return false;
		}
		
		return isBalanced(root.left)  && isBalanced(root.right);
		
		
	}

	private int getDepth(Treenode root)
	{
		if(root == null) return 0;
		return Math.max(getDepth(root.left), getDepth(root.right)) +1;
	}
}
