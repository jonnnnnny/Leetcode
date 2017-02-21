package leetcode;

public class LinkedlistCycle141 {

	public boolean hasCycle(ListNode head) {
		if (head==null||head.next==null) {
			return false;
		}
		ListNode slow,fast;
		slow=head;
		fast=head;
		while(fast!=null&& fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if (slow==fast) {
				return true;
			}
		}
		return false;
	}
	public ListNode detectCycle(ListNode head)
	{
		
		if (head == null || head.next ==null)
		{
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast !=null && fast.next !=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			while(slow == fast)
			{
				slow = head;
				while(slow ==fast)
				{
					slow = slow.next;
					fast=fast.next;
					return slow;
				}
			}
		}
		return null;
	}
}
