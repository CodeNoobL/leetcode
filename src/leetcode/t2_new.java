package leetcode;
public class t2_new {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		result = add(l1, l2, result, 0);
		return result;
	}

	public ListNode add(ListNode l1, ListNode l2, ListNode result, int add) {
		int i;
		int newadd;
		if (l1 != null && l2 != null) {
			i = ((l1.val + l2.val) % 10 + add) % 10;
			newadd = (l1.val + l2.val + add) / 10;
			result = new ListNode(i);
			result.next = add(l1.next, l2.next, result.next, newadd);
		} else if (l1 != null) {
			i = (l1.val + add) % 10;
			newadd = (l1.val + add) / 10;
			result = new ListNode(i);
			result.next = add(l1.next, null, result.next, newadd);
		} else if (l2 != null) {
			i = (l2.val + add) % 10;
			newadd = (l2.val + add) / 10;
			result = new ListNode(i);
			result.next = add(null, l2.next, result.next, newadd);
		} else if (add != 0) {
			result= new ListNode(add);
		} else {
		}
		return result;

	}

	
}
