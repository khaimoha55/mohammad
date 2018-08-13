package test;

public class TwoDArray {

	public static void main(String[] args) {
		//Array: is a subscripted variable which ca store multiple values of same type
		
		//Creation of Array
		//Two Dimension Array
		//DataType [][] varName=new DataType[rowSize][colSize];
		                               String[][] states=new String[3][2];
		                               
		                               
		                               // row index--> 0 to rowsize-1
		                               //col index 0 to colsize-1
		                               //rowsize
		                               int rowSize=states.length;
		                               System.out.println( "rowSize= "+rowSize);
		                             //colsize
		                           int  colSize=states[0].length;
		                           System.out.println( "colsize= "+colSize);
		                           
		                           //Row I data
		                           states[0][0]="Ap";
		                           states[0][1]="TS";
		                           
		                           //Row II data
		                           states[1][0]="Up";
		                           states[1][1]="MP";
		                           
		                           //Row III data
		                           states[2][0]="BH";
		                           states[2][1]="TN";
		                           
		                           for(int i=0; i<rowSize;i++)
		                           {
		                        	   for(int j=0; j<colSize;j++)
		                        	   {
		                        		   System.out.print( "--"+states[i][j]);
		                        	   }
		                        	   System.out.println();
		                           }

}



	}


