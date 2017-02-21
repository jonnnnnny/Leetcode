package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class FindModeInBST501
{

	public int[] finMore(Treenode root)
	{
		List<Integer> res = inorderTraversal(root);
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer tmp : res)
		{
			if (map.containsKey(tmp))
			{
				map.put(tmp, map.get(tmp)+1);
			}else {
				map.put(tmp, 1);
			}
		}
		int max = 0;
		Set<Integer> sets = new HashSet<>();
		for(Integer tmp : map.keySet())
		{
			if (map.get(tmp) > max)
			{
				sets.clear();
				sets.add(tmp);
				max = map.get(tmp);
			}else if (map.get(tmp) == max) {
				sets.add(tmp);
			}
			
		}
		int[] result = new int[sets.size()];
		int i=0;
		for(int tmp : sets)
		{
			result[i] = tmp;
			i++;
		}
		return result;
	}
	
	public List<Integer> inorderTraversal(Treenode root)
	{
		List<Integer> list = new ArrayList<>();
		if (root == null)
		{
			return list;
		}
		if (root.left != null)
		{
			List<Integer> res = inorderTraversal(root.left);
			list.addAll(res);
		}
		list.add(root.val);
		if (root.right != null)
		{
			List<Integer> res = inorderTraversal(root.right);
			list.addAll(res);
		}
		return list;
	}
	Integer pre = null;
	int count =1;
	int max = 0;
	public void traverse(Treenode root, List<Integer> list)
	{
		if (root == null)
		{
			return ;
		}
		traverse(root.left, list);
		if (pre != null)
		{
			if (root.val == pre)
			{
				count ++;
			}else {
				count = 1;
			}
		}
		if (count > max)
		{
			max = count;
			list.clear();
			list.add(root.val);
		}else if (count == max) {
			list.add(root.val);
		}
		pre = root.val;
		traverse(root.right, list);
		
	}
}
