package practice.array;

public class CyclicRotate {
 
	
	public void cycleRotate(int cycle[]) {
		
		
		int temp=0,i=0,n=0; 
		  n=cycle.length-1;
		  temp=cycle[n]; 
		//  System.out.println(temp);
		//  System.out.println(n);
		  
		  for(i=n;i>0;i--) {
			  cycle[i]=cycle[i-1]; 
		  }
		cycle[i]=temp;
	}
	public void display(int array[]) {
	
		for(int i=0;i<=array.length-1;i++) {
			System.out.println(array[i]);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int cycle[]= {10,20,30,40,50};
    CyclicRotate cc=new CyclicRotate();
    cc.cycleRotate(cycle); 
    cc.display(cycle);
	}

}
