public class Arrays {
	  public static void main(String[] args) {
		 int[] arr = {1,2,3,4,8,9,14};
		 int size = arr.length;
		 int sum = 0;
		 		 
		  
		 for (int i = 0; i < size; i++) {  
	           sum = sum + arr[i];  
	        }
		 
		 double average = (double)sum/arr.length;
		 
		 System.out.print("Given this array as Array 1: ");
		 for (int i = 0; i < size; i++) { 	
		 System.out.print(arr[i]+ " ");
		 }
		 	System.out.println("");
		 	System.out.println("Sum of all the elements of an array: " + sum);
	        System.out.println("Average of all the elements of an array: " + average);
		
	        System.out.print("Even Numbers: ");
	        for (int i = 0; i < size; i++) {
	    	if (arr[i]%2 == 0)
	       		System.out.print(arr[i] + " ");
	        }
	        
	        System.out.println("");
	        
	        System.out.print("Odd Numbers: ");
	        for (int i = 0; i < size; i++) {
	    	if (arr[i]%2 != 0)
	       		System.out.print(arr[i] + " ");
	        }
	        System.out.println("");
	        
	        int[] arr2 = {1,2,3,4,8,9};
	        int sum2 = 0;
	        int size2 = arr2.length;
	        
	        System.out.print("Given this array as Array 2: ");
			 for (int i = 0; i < size2; i++) { 	
			 System.out.print(arr2[i]+ " ");
			 }
			 
			System.out.println("");
	        
	        for (int i = 0; i < size2; i++) {  
		           sum2 = sum2 + arr2[i];  
		        }
	        int miss = sum-sum2;
	        System.out.println("Missing number between Array 1 and 2: " + miss);
	 
	        int great = arr[0];
	        int small = arr[0];
	        
	        for(int i = 0; i<size; i++) {
	        	if (arr[i] > great)
	        		great = arr[i];       
	        }
	        System.out.println("Greatest number in Array: " + great);
	        
	        for(int i = 0; i<size; i++) {
	        	if (arr[i] < small)
	        		small = arr[i];       
	        }
	        System.out.println("Smallest number in Array: " + small);
	        
	        String dup = "";
	        
	        for(int i = 0; i <size; i++) {
	        	for (int j= i+1; j<size;j++) {
	        		if(arr[i]==arr[j])
	        			dup = dup + arr[j] + " ";
	        		
	       	}
	        }
	        if (dup == "") 
	        		System.out.println("No duplicates in array.");
	        else
	        	System.out.println("Duplicate elements in given array: " + dup);
	        
}
	  }
