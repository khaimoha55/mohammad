package test;

public class FindLargstnoinArray {

	public static void main(String[] args) {
		int[] arr = {28,3,26,25,29,30};
		
		int val = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>val) {
				val=arr[i];
				
			}
		}
		System.out.println("Largest value of giben array is ::" + val );
	}

}
