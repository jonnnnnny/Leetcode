package leetcode;

public class ConvertSortedArrayToBST108
{
	

	public Treenode sortedArrayToBST(int[] num)
	{
		
		if (num.length == 0)
		{
			return null;
		}
		Treenode head = sortedArrayToBST(num, 0, num.length-1);
		return head;
	}

	private Treenode sortedArrayToBST(int[] num, int i, int j)
	{
		if (i > j)
		{
			return null;
		}
		int mid = (i+j)/2;
		Treenode treenode = new Treenode(num[mid]);
		treenode.left = sortedArrayToBST(num, i, mid-1);
		treenode.right = sortedArrayToBST(num, mid+1, j);
		
		return treenode;
	}
}
