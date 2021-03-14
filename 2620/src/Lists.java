public class Lists {

    /**
     * The definition for the linked list. DO NOT modify this class.
     */
    public static class ListNode {
        int value;
        ListNode next;
        ListNode(int value) {
            this.value = value;
        }
    }
    /**
     * The method for you to implement.
     *
     * DO NOT change the method header.
     */
    public ListNode merge(ListNode l1, ListNode l2) {
       
    ListNode dummy = new ListNode(0);
    
    ListNode tail = dummy;
    while(true) {
    	
    	if(l1 == null) {
    		tail.next = l2;
    		break;
    	}
    
    if(l2 == null) {
    	tail.next = l1;
    	break;
     
    }
    if(l1.value <= l2.value) {
    	tail.next = l1;
    	l1 = l1.next;
    }
    else {
    	tail.next = l2;
    	l2 = l2.next;
    }
    
   tail = tail.next;
    }
    
    return dummy.next;
    }

    /**
     * The main method is for test only and won't be evaluated.
     */
    public static void main(String[] args) {
        Lists solution = new Lists();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode nextA = a;
        ListNode nextB = b;
        for (int i = 1; i < 5; ++i) {
            nextA.next = new ListNode(nextA.value + 2);
            nextB.next = new ListNode(nextB.value + 2);
            nextA = nextA.next;
            nextB = nextB.next;
        }
        ListNode c = solution.merge(a, b);
        // Should print 1 to 10.
        while (null != c) {
            System.out.println(c.value);
            c = c.next;
        }

    }
}