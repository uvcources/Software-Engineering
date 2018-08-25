package practice.stack;

public class StackImpl {

	int Max=1000;
	int stk[]=new int[Max];
	int top;
	StackImpl() {
		top=-1;
	}
	int push(int data) {
		
		if(top>Max) {
			System.out.println("OverFlow"); 
	
		}else {
			stk[++top]=data;
		}
		
		return top;
		
	}
	
	boolean pop() {
		
		if(top<0) {
			System.out.println("Stack is underflow"); 
			return false;
		}
		else {
			int data=stk[top--]; 
			System.out.println("Pop Data : "+ data);
			return true;
		}
	
	}
	
	void stackTraverse() {
		for (int i = 0; i <=top; i++) { 
			System.out.println(stk[i]);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StackImpl s=new StackImpl();
     s.push(50);
     s.push(40);
     s.push(30);
     s.push(20);
     s.push(10); 
     System.out.println("Before Pop");
     s.stackTraverse();
     System.out.println("After Pop Top Element");
     s.pop();     
     s.stackTraverse();
	}

}
