

public class MergeSort {
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
     * Merges two sorted lists.
     */
    private ListNode merge(ListNode l1, ListNode l2) {
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

    public ListNode mergeSort(ListNode list, int size) {
        
    	if(list == null || list.next == null)
    		return list;
    	
    	ListNode mid = getMid(list);
    	ListNode left = list;
    	ListNode right = mid.next;
    	mid.next = null;
    	
    	return merge(mergeSort(left, size), mergeSort(right, size));
    	
    }
    	  
    	static ListNode getMid(ListNode head) {
    		
    		if (head == null || head.next == null) {
    	        return head;
    	    }
    	    ListNode slow = head;
    	    ListNode fast = head;
    	    while (fast.next != null && fast.next.next != null) {
    	        fast = fast.next.next;
    	        slow = slow.next;
    	    }
    	    return slow;
    	}
    		
    	
    		
    	 
    	
    

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        MergeSort solution = new MergeSort();
        ListNode result = solution.mergeSort(node1, 5);
        // The output should be 2, 4, 4, 5, 8,
        while (null != result) {
            System.out.print(result.value + ", ");
            result = result.next;
        }
    }
}
