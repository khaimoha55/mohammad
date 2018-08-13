package test;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		String[][] states = new String[3][2];
		
		//rowSize
		int rowSize =states.length;
		System.out.println( "rowSize= "+rowSize);
		
		//colSize
		int colSize = states[0].length;
		System.out.println( "colSize= " +colSize);
		
		//Row I datea
		
		states[0][0]="london";
		states[0][1]="scotland";
		
		//Row II data 
		
		states[1][0]="sunbury";
		states[1][1]="cheswick";
		
		//Row III data
		
		states[2][0]="greenpark";
		states[2][1]="teddington";
		
		//print an array
		
		/*for(int i=0; i<rowSize; i++)
		{
			for (int j=0; j<colSize;j++)
			{
				System.out.println( "--"+states[i][j]);
				
			}
				System.out.println();*/
		
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

