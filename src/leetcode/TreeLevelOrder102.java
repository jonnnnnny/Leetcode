package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class TreeLevelOrder102 {
	
	public static List<List<Integer>> levelOrder(Treenode root){
		List<List<Integer>> result=new LinkedList<>();
		Queue<Treenode> queue=new LinkedList<>();
		if(root==null)return result;
		queue.offer(root);
		while(!queue.isEmpty()){
			int s=queue.size();
			List<Integer> list=new LinkedList<>();
			for(int i=0;i<s;i++){
			Treenode node=queue.poll();
			if (node.left!=null) {
				queue.offer(node.left);				
			}
			if(node.right!=null){
			queue.offer(node.right);}
			list.add(node.val);
			}
			result.add(list);
		}
		return result;
	}

}
