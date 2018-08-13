package test;

public class OneDimentionArray {
	
	//Array is a subscripted variable which can store multiple values of same type.

	public static void main(String[] args) {
		//creation of an array
		//one Dimension array 
		
		int[] ar = new int [5];
		
		//Initialization of an array
		//varName[index]
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		ar[4]=5;
		
		
		//Array size 
		
		int arraySize =ar.length;
		System.out.println("arraySize =" +arraySize);
		for(int i=0; i<arraySize; i++) {
			System.out.println(ar[i]);
		

	}

}
	
}

//initilization of an array
//varName[index]
//size of an array 
//int arraysize = variable.length
//print an array

