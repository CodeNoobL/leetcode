package leetcode;
/*
 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。

你可以假设除了数字 0 之外，这两个数字都不会以零开头。

示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
 */

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class t002 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result;
		long a, b;
		a = add(l1, 0, 0);
		b = add(l2, 0, 0);
		long c = a + b;
		result = change(new ListNode(0), c);
		return result;
	}

	public  long add(ListNode l, long a, int i) {
		a = (long) (a + l.val * Math.pow(10, i));
		if (l.next != null) {
			a = add(l.next, a, ++i);
			return a;
		} else {
			return a;
		}
	}

	public  ListNode change(ListNode l, long a) {
		l.val = (int) (a % 10);
		if (a >= 10) {
			l.next = new ListNode(0);
			change(l.next, a / 10);
		} else {
			return l;
		}
		return l;
	}

	public void setNext(ListNode l, int a) {
		l.next = new ListNode(a);
	}

	public static void main(String[] args) {
		t002 t = new t002();
		ListNode l0 = new ListNode(9);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
		long a = t.add(l0, 0, 0);
		//System.out.println(a);
		long b = t.add(l2, 0, 0);
		//System.out.println(b);
		long c = a + b;
		//System.out.println(c);
		ListNode l3 = t.change(new ListNode(0),c);
		
	}
}
