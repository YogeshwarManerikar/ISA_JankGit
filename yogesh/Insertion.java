/**
 * 
 */

/**
 * @author Yogesh-Pc
 *
 */
public class Insertion {
	 public static void insertionSort(int array[]) {  
	        Integer n = array.length;  
	        for (Integer j = 1; j < n; j++) {  
	            Integer key = array[j];  
	            Integer i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	 }

	/**
	 * @param args
	 */
		
		       
		    public static void main(String a[]){    
		        int[] arr1 = {9,14,3,2,43,11,58,22};    
		        System.out.println("Before :-");    
		        for(int i:arr1){    
		            System.out.print(i+" ");    
		        }    
		        System.out.println();    
		            
		        insertionSort(arr1);//sorting array using insertion sort    
		           
		        System.out.println("After :-");    
		        for(int i:arr1){    
		            System.out.print(i+" ");    
		        }    
		    }    
		  

	}


