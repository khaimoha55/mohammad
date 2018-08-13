package test;

public class MethodDemo_01 {

	public static void main(String[] args) {
		
		MethodDemo_01 md1 = new MethodDemo_01();
		// pass by value 
		md1.addition(200, 5 );
		int khai = md1.addition(200, 5 );
		System.out.println(khai);
		
		//pass by reference 
		
		int a=10;
		int b=20;
		
		md1.multiplication(a, b);
		int khai1 = md1.multiplication(a, b);
		System.out.println(khai1);
      
	}
	
 
	
	//Method Defination
	int multiplication(int a, int b) {
		
		
		int c=a*b;
		return(c);
		
	}
			
			
	int addition(int m, int n) {
		
	int x= m+n;
	return(x);
	
		
	}

  
	
	
}

