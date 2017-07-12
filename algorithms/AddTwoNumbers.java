	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode((l1.val + l2.val) % 10);
		ListNode firstElement = result;
		int carry = (l1.val + l2.val) / 10;
		while (l1.next != null && l2.next != null) {
			l1 = l1.next;
			l2 = l2.next;
			ListNode newNode = new ListNode((l1.val + l2.val + carry) % 10);
			carry = (l1.val + l2.val + carry) / 10;
			result.next = newNode;
			result = newNode;
		}
		if (l1.next != null || l2.next != null) {
			ListNode remnList = l1.next == null ? l2.next : l1.next;
			while (remnList != null) {
				ListNode newNode = new ListNode((remnList.val + carry) % 10);
				carry = (remnList.val + carry) / 10;
				result.next = newNode;
				result = newNode;
				remnList = remnList.next;
			}
		}
		if (carry != 0) {
			ListNode newNode = new ListNode(carry);
			result.next = newNode;
		}
		return firstElement;
	}
