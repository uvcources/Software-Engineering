package practice.LinkedList;

class Node {
	int data; 
	Node left,right;
	Node(int item) {
		data=item;
		left=null;
		right=null;
	}
}

public class BinaryTree { 
	Node root;
	BinaryTree()
	{
		root=null;
	} 
	
	public void insert(int data) {
		
		root=insertRec(root,data);
		
	} 
	public Node insertRec(Node root,int data) { 
		
		if(root==null)  {
			root= new Node(data); 
		} 
		
		if(data < root.data) {
			root.left=insertRec(root.left,data);
		}else if(data >root.data) 
			root.right=insertRec(root.right,data);
		return root;
	} 
	 void inorder()  {
		 printInorder(root);
	    }
	public void printInorder(Node root) {
		if(root!=null) {
			printInorder(root.left);
			System.out.println(root.data); 
			printInorder(root.right);
		}
	}
	
	public static void main(String arg[]) 
	{
		BinaryTree b=new BinaryTree();
		b.insert(50);
		b.insert(30);
		b.insert(20);
		b.insert(40);
		b.insert(70);
		b.insert(60);
		b.insert(80);
		b.inorder();
	}
}
