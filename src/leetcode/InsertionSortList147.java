package leetcode;

public class InsertionSortList147
{

	public ListNode insertionSort(ListNode head)
	{
		if(head == null || head.next == null ) return head;
		ListNode root = new ListNode(0);
		ListNode cur = head, p,r;
		root.next = head;
		while(cur !=null && cur.next != null)
		{
			if (cur.val <= cur.next.val)
			{
				cur = cur.next;
			}else {
				p = cur.next;
				cur.next = p.next;
				r = root;
				while(r.next.val <= p.val)
				{
					r=r.next;
				}
				p.next = r.next;
				r.next = p;
			}
		}
		return root.next;
	}
}
