package practice.Queue;

public class QueueImpl {

	int size;
	int front,rear,capacity;
	int Qu[]; 
	
	QueueImpl(int capa)
	{
		front=size=0; 
		capacity=capa;
		rear=0;
		Qu=new int[capacity];
	} 
	
	boolean isFull() {
		if(size==capacity) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isEmpty() {
		if(size==0) {
			return true;
		}else { 
			return false;
		}
	}
	int enqueue(int data) {
		
		if(isFull()) { 
			System.out.println("Cannot Insert");
			return data;
		} 
		Qu[rear]=data;
		rear=rear+1;
		size+=1;
		
		return data;
	} 
	
	
	
	void dqueue() {
		if(isEmpty()) 
		{
			System.out.println("There is no Data to Remove");
		}
		
		int data =Qu[front]; 
		System.out.println("Removed "+data+" from Queue");
		front=front+1;
		size=size-1;
        		
	}
	
	void QueueTraverse() {
		for(int i=0;i<=Qu.length;) {
			System.out.println(Qu[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       QueueImpl q=new QueueImpl(1000);  
       int i=0; 
       System.out.println("Inserted  " + q.enqueue(10)); 
       System.out.println("Inserted  " + q.enqueue(20)); 
       System.out.println("Inserted  " + q.enqueue(30)); 
       System.out.println("Inserted  " + q.enqueue(40)); 
       System.out.println("Inserted  " + q.enqueue(50)); 
       
       q.dqueue();    
    		   
      /* System.out.println("Before Remove "); 
       q.QueueTraverse(); 
       q.QueueRemove();
       System.out.println("After Remove "); 
       q.QueueTraverse(); */
       
	}
}
