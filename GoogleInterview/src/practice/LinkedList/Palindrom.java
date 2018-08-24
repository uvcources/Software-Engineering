package practice.LinkedList;

public class Palindrom {

	
	Node head; 
	Node slowptr;
	Node fastptr; 
	Node secondhalf;
	
	static class Node{
		char data; 
		Node next; 
		
		Node(char d) {
			data=d;
			next=null;
		}
		
	}
	public void push(char data) { 
		
		Node newNode; 
		newNode=new Node(data); 
		newNode.next=head;
		head=newNode; 
		
	//	System.out.println("calling : "+ data);
		
	}
	
	public boolean isPalindrom() {
		
		boolean result=false; 
		Node prev_of_slow_ptr,midNode;
		while(fastptr!=null && fastptr.next!=null) {
			slowptr=slowptr.next;
			fastptr=fastptr.next.next; 
		} 
		
		if(fastptr!=null) {
		midNode=slowptr;
		slowptr=slowptr.next;
		prev_of_slow_ptr=null;
		} 
		
		reverse();
		 result=compareList(head,secondhalf); 
		if(result) System.out.println("The Given List Palindrom");
		else System.out.println("The Given List is not Palindrom");
		
		
		reverse(); 
		
		printList();
		return result;
	} 
	public void printList() {  
		Node current=head;
		while(current!=null) {
			System.out.println(current.data); 
			current=current.next;
		}
	}
	public void reverse() {
		Node next;
		
		while(secondhalf.next!=null) {
			next=secondhalf.next;
			secondhalf.next=slowptr;
			secondhalf=next;
			
		}
	} 
	
	public boolean compareList(Node head,Node secondhalf) { 
		boolean result=true;
		while(head.next!=null) {
			if(head.data!=secondhalf.data) {
				result=false;
			}
			head=head.next;
		}
		return result;
	}
	
	
	public int findLength()
	{
		int len=0;
		Node slowptr;
		Node fastptr; 
		slowptr=fastptr=head; 
		
		while(fastptr!=null && fastptr.next!=null) {
			slowptr=slowptr.next;
			fastptr=fastptr.next.next; 
			len+=1;
		}
		return len;
		
		
	}
	
	public static void main(String[] args) {
		Palindrom p=new Palindrom();
		char str[]= {'M','A','D','A','M'};
		for(int i=0;i<str.length;i++) {
			p.push(str[i]);
		}
		
		p.printList();
		
		
		
		// TODO Auto-generated method stub

	}

}
