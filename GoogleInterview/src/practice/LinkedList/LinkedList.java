package practice.LinkedList;

class LinkedList {
	 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    public void push( int data) { 
    	Node new_node;
    	new_node=	new Node(data);
    	new_node.next=head;
    	head=new_node;
    }
 
    public int findMiddleList()
    { 
    	int length=0;
    	    Node fastptr=head;
    	    Node slowPtr=head; 
    	    while(fastptr!=null) { 
    	    	fastptr=fastptr.next.next;
    	    	slowPtr=slowPtr.next;
    	    	length+=1;
    	    }
    	    return length;
    }
    /* Function to remove duplicates from an
       unsorted linked list */
    void remove_duplicates() {
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;
 
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1; 
 
            /* Compare the picked element with rest
                of the elements */
            while (ptr2.next != null) {
 
                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {
 
                    /* sequence of steps is important here */
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }
 
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(10);
        list.push(11);
        list.push(12);
        list.push(13);
        list.push(14);
        list.push(15);
        
      /*  System.out.println("Linked List before removing duplicates : \n ");
        list.printList(head);*/
 
        list.remove_duplicates();
        System.out.println("");
        System.out.println("Linked List after removing duplicates : \n ");
        list.printList(head); 
        
        System.out.println(list.findMiddleList());
        
    }
}
// This code has been contributed by Mayank Jaiswal
