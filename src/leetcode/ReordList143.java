package leetcode;

import java.util.Queue;

public class ReordList143
{

	public void reorderList(ListNode head)
	{
		
		ListNode slow, fast;
		slow = head;
		fast = head;
		while(fast !=null && fast.next !=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
		}
		fast = slow.next;
		slow.next = null;
		fast = reverseList(fast);
		slow = head;
		while(slow.next !=null)
		{
			ListNode p=slow.next;
			ListNode q = fast.next;
			slow.next= fast;
			fast.next = p;
			slow = p;
			fast = q;
		}
	}
	public ListNode reverseList(ListNode root)
	{
		if(root ==null || root.next == null) return root;
		ListNode p = root.next;
		root.next = null;
		while(root.next !=null)
		{
			root=p;
			p= root.next;
		}
		return root;
	}
	
	
}
