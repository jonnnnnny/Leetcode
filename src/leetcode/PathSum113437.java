package leetcode;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PathSum113437
{

	private List<List<Integer>> result;
	private List<Integer> tmp;
	private int cur=0;
	private int sum;
	public List<List<Integer>> pathSum2(Treenode root, int sum)
	{
		result = new ArrayList<>();
		
		if(root != null)
		{
			this.sum= sum;
			tmp = new ArrayList<>();
			pathSum2(root);
		}
		return result;
	}
	private void pathSum2(Treenode root)
	{
		if (root !=null)
		{
			cur += root.val;
			tmp.add(root.val);
			if(root.left == null && root.right == null)
			{
				if (cur == sum)
				{
					List<Integer> list = new ArrayList<>();
					for (Integer integer : tmp)
					{
						list.add(integer);
					}
					result.add(list);
				}
			}
			if (root.left != null)
			{
				pathSum2(root.left);
			}
			if (root.right != null)
			{
				pathSum2(root.right);
			}
			cur -= root.val;
			tmp.remove(tmp.size()-1);
		}
		
	}
	private int count = 0;
	public int pathSum(Treenode root, int sum)
	{
		if(root == null) return 0;
		rootPath(root, sum, 0);
		pathSum(root.left, sum);
		pathSum(root.right, sum);
		return count;
	}
	private void rootPath(Treenode root, int sum, int i)
	{
		if(root == null) return ;
		if(root.val + i == sum) count++;
		rootPath(root.left, sum, i+root.val);
		rootPath(root.right, sum, i+root.val);
		
	}
}
