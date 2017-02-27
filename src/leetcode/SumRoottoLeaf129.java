package leetcode;

public class SumRoottoLeaf129
{

	public int sumRootToLeaf(Treenode root)
	{
		int sum = 0;
		if (root == null)
		{
			return 0;
		}
		return preorder(root, sum);
	}
	public int preorder(Treenode root,int sum)
	{
		if (root == null)
		{
			return 0;
		}
		sum = sum * 10 + root.val;
		if (root.left == null && root.right == null)
		{
			return sum;
		}
		return preorder(root.left, sum) + preorder(root.right, sum);
	}
}
