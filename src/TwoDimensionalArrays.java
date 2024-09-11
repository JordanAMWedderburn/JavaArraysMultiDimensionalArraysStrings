
public class TwoDimensionalArrays {
	public static void main(String[] args) {
	int arr[][] = {{50,60,70},{80,90,100}};
	int sum = 0;
	int count = 0;
	
	System.out.println("Given this 2D Array: ");
	for (int i = 0; i < arr.length; ++i) {
        for(int j = 0; j < arr[i].length; ++j) {
           System.out.print(arr[i][j] + " ");
           sum = sum + arr[i][j];
           count++;
        }
        System.out.println();
     }
	double average = (double)sum/count;
	System.out.println("The average between both students is: " + average);
	System.out.println();
	
	int rows = 2;
	int columns = 2;
	int matA[][] = {{1,2},
					{3,4}};
	int matB[][] = {{1,2},
					{3,4}};
	int res[][] = new int[rows][columns];
	
	System.out.println("Matrix A: ");
	for (int i = 0; i < matA.length; ++i) {
        for(int j = 0; j < matA[i].length; ++j) {
           System.out.print(matA[i][j] + " ");      
        }
        System.out.println();
     }
	System.out.println("Matrix B: ");
	for (int i = 0; i < matB.length; ++i) {
        for(int j = 0; j < matB[i].length; ++j) {
           System.out.print(matB[i][j] + " ");      
        }
        System.out.println();
     }
	
	for(int i = 0; i < rows; i++) {
		for (int j = 0; j < columns; j++) {
			res[i][j] = matA[i][j] + matB[i][j]; 
	}	
	}
	System.out.println("Sum of the given matrices is: ");
	for(int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print(res[i][j] + "    ");
        }
        System.out.println();
	
}
}
}
