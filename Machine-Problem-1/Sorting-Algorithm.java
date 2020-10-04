package SortingAlgorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class SortingAlgorithm {
    
	public static void BucketSort(int[]array,int n){
		 if (n <= 0) 
	            return; 
	  
	        // 1) Create n empty buckets 
	        @SuppressWarnings("unchecked") 
	        Vector<Integer>[] buckets = new Vector[n]; 
	  
	        for (int i = 0; i < n; i++) { 
	            buckets[i] = new Vector<Integer>(); 
	        } 
	  
	        // 2) Put array elements in different buckets 
	        for (int i = 0; i < n; i++) { 
	            float idx = array[i] * n; 
	            buckets[(int)idx].add(array[i]); 
	        } 
	  
	        // 3) Sort individual buckets 
	        for (int i = 0; i < n; i++) { 
	            Collections.sort(buckets[i]); 
	        } 
	  
	        // 4) Concatenate all buckets into arr[] 
	        int index = 0; 
	        for (int i = 0; i < n; i++) { 
	            for (int j = 0; j < buckets[i].size(); j++) { 
	                array[index++] = buckets[i].get(j); 
	            } 
	        } 
	}
	public static void InsertionSort(int[]array) {
		int n = array.length; 
        for (int i = 1; i < n; ++i) { 
            int key = array[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && array[j] > key) { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = key; 
        } 
	}
	
	public static void SelectionSort(int[]array){
		int n = array.length; 
		  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (array[j] < array[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        } 
	}
	public static void BubbleSort(int[]array){
		int n = array.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(array[j-1] > array[j]){  
                                 //swap elements  
                                 temp = array[j-1];  
                                 array[j-1] = array[j];  
                                 array[j] = temp;  
	}
       }        
         }
         
           }
	 static int partition(int array[], int low, int high) 
	    { 
	        int pivot = array[high];  
	        int i = (low-1); // index of smaller element 
	        for (int j=low; j<high; j++) 
	        { 
	            // If current element is smaller than the pivot 
	            if (array[j] < pivot) 
	            { 
	                i++; 
	  
	                // swap array[i] and array[j] 
	                int temp = array[i]; 
	                array[i] = array[j]; 
	                array[j] = temp; 
	            } 
	        } 
	  
	        // swap array[i+1] and array[high] (or pivot) 
	        int temp = array[i+1]; 
	        array[i+1] = array[high]; 
	        array[high] = temp; 
	  
	        return i+1; 
	    } 
	 public static void QuickSort(int array[], int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            /* pi is partitioning index, arr[pi] is  
	              now at right place */
	            int pi = partition(array, low, high); 
	  
	            // Recursively sort elements before 
	            // partition and after partition 
	            QuickSort(array, low, pi-1); 
	            QuickSort(array, pi+1, high); 
	        } 
	    } 
	 static void merge(int array[], int l, int m, int r) 
	    { 
	        // Find sizes of two subarrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        /* Create temp arrays */
	        int L[] = new int[n1]; 
	        int R[] = new int[n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i = 0; i < n1; ++i) 
	            L[i] = array[l + i]; 
	        for (int j = 0; j < n2; ++j) 
	            R[j] = array[m + 1 + j]; 
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays 
	        int i = 0, j = 0; 
	  
	        // Initial index of merged subarry array 
	        int k = l; 
	        while (i < n1 && j < n2) { 
	            if (L[i] <= R[j]) { 
	                array[k] = L[i]; 
	                i++; 
	            } 
	            else { 
	                array[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) { 
	            array[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) { 
	            array[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	  
	    // Main function that sorts arr[l..r] using 
	    // merge() 
	    public static void MergeSort(int array[], int l, int r) 
	    { 
	        if (l < r) { 
	            // Find the middle point 
	            int m = (l + r) / 2; 
	  
	            // Sort first and second halves 
	            MergeSort(array, l, m); 
	            MergeSort(array, m + 1, r); 
	  
	            // Merge the sorted halves 
	            merge(array, l, m, r); 
	        } 
	    } 
	  
	public static void DescendingArray(int[]array) {
		int temp = 0; 
		 for (int i = 0; i < array.length; i++) {     
	            for (int j = i+1; j < array.length; j++) {     
	               if(array[i] < array[j]) {    
	                   temp = array[i];    
	                   array[i] = array[j];    
	                   array[j] = temp;    
	               }     
	            }     
	        }    
	}
	
	public static void InputValueofArray(Scanner UserInput, int []array) {
		 for(int i=0;i<20;i++) {
	        	
		        int arrayvalue=UserInput.nextInt();
		        if(arrayvalue>0 && arrayvalue<=100) {
		        array[i]=arrayvalue;
		        
		        }
		        else {
		        	System.out.println("Input is invalid");
		        }    
		        }
		
		        
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner UserInput= new Scanner(System.in);
		
		
		int [] array = new int[20];
		
		char answer='Y';
		Scanner Input=new Scanner(System.in);
		do {
		System.out.println("Type the values of the Array: ");
		InputValueofArray(UserInput,array);
		
	     
        System.out.println("---------- MAIN MENU -----------");
        System.out.println();
        System.out.println("|CHOOSE TYPE OF SORTING ALGORITHM|");
        System.out.println("[L]- Elementary Sorting");
        System.out.println("[G]- Efficient Sorting");
        
        //Scanner for the type of sorting algorithm
        Scanner SortingType= new Scanner(System.in);
        
        System.out.print("Enter Your Choice: ");
        char SortType=SortingType.next().charAt(0);
        
        char L;//elementary sorting
        char G;// Efficient Sorting
        
        if(SortType =='L') {
        	System.out.println("CHOOSE SORTING ALGORITHM"); //Elementary Sorting
        	
        	System.out.println("[1] Bin/Bucket Sort"); // Press Bucket Sort
        	System.out.println("[2] Insertion Sort");  // Press Insertion Sort
        	System.out.println("[3] Selection Sort");  // Press Selection Sort
        	System.out.println("[4] Bubble Sort");     // Press Bubble Sort
        	System.out.print("Enter your Choice: ");
        	Scanner ElementarySort = new Scanner(System.in);
        	int Elementary_SortValue= ElementarySort.nextInt();
            
        	switch(Elementary_SortValue) {
        	
        	case 1:
        	System.out.println("Bin/Bucket Sort");
        	System.out.println("[C] Ascending");
        	System.out.println("[I] Descending");
        	Scanner BucketSorting= new Scanner(System.in);
        	
        	char BucketSort= BucketSorting.next().charAt(0);
        	
        	if(BucketSort == 'C') {
        		 int n = array.length; 
        	        BucketSort(array, n); 
        		for (int value : array) { 
                    
        	    System.out.print(value);
        	}
        		
        	}
        	else if(BucketSort == 'I') {
        		DescendingArray(array);
        		System.out.println(Arrays.toString(array));
        	}
        		break;
        	case 2:
        	System.out.println("Insertion Sort");
        	System.out.println("[C] Ascending");
    	    System.out.println("[I] Descending");
    	    
          Scanner InsertionSorting= new Scanner(System.in);
        	
        	char InsertionSort= InsertionSorting.next().charAt(0);
        	
        	if(InsertionSort == 'C') {
        		InsertionSort(array);
        	    System.out.println(Arrays.toString(array));
        	}
        	else if(InsertionSort == 'I') {
        		DescendingArray(array);
        		System.out.println(Arrays.toString(array));
        	}
        		break;
        	case 3:
        	System.out.println("Selection Sort");
        	System.out.println("[C] Ascending");
    	    System.out.println("[I] Descending");
    	    
            Scanner SelectionSorting= new Scanner(System.in);
        	
        	char SelectionSort= SelectionSorting.next().charAt(0);
        	
        	if(SelectionSort == 'C') {
        		SelectionSort(array);
        	    System.out.println(Arrays.toString(array));
        	}
        	else if(SelectionSort == 'I') {
        		DescendingArray(array);
        		System.out.println(Arrays.toString(array));
        	}
        		break;
        	case 4:
        	System.out.println("Bubble Sort");
        	System.out.println("[C] Ascending");
    	    System.out.println("[I] Descending");
    	    
    	    Scanner BubbleSort= new Scanner(System.in);
    	    char BubbleSorting = BubbleSort.next().charAt(0);
    	    
    	    if(BubbleSorting == 'C') {
    	    	BubbleSort(array);
    	    	System.out.println(Arrays.toString(array));
    	    }
    	    else if(BubbleSorting == 'I'){
    	    	DescendingArray(array);
    	    	System.out.println(Arrays.toString(array));
    	    	
    	    }
    	   
        		break;
       
        	}
        
        }
        else if (SortType =='G') {
        	System.out.println("CHOOSE SORTING ALGORITHM"); // Efficient Sorting 
        	System.out.println("[5] Quick Sort");
        	System.out.println("[6] Merge Sort ");
        	Scanner EfficientSort = new Scanner(System.in);
        	
        	int Efficient_SortValue= EfficientSort.nextInt();
        	
        	switch(Efficient_SortValue) {
        	case 5:
        	System.out.println("Quick Sort");
        	System.out.println("[C] Ascending");
    	    System.out.println("[I] Descending");
    	    
            Scanner QuickSorting= new Scanner(System.in);
        	
        	char QuickSort= QuickSorting.next().charAt(0);
        	
        	if(QuickSort == 'C') {
        		int n=array.length;
        		QuickSort(array,0,n-1);
        	    System.out.println(Arrays.toString(array));
        	}
        	else if(QuickSort == 'I') {
        		DescendingArray(array);
        		System.out.println(Arrays.toString(array));
        	}
        		break;
        	case 6:
        	System.out.println("Merge Sort");
        	System.out.println("[C] Ascending");
    	    System.out.println("[I] Descending");
           Scanner MergeSorting= new Scanner(System.in);
        	
        	char MergeSort= MergeSorting.next().charAt(0);
        	
        	if(MergeSort == 'C') {
        		MergeSort(array,0,array.length-1);
        	    System.out.println(Arrays.toString(array));
        	}
        	else if(MergeSort == 'I') {
        		DescendingArray(array);
        		System.out.println(Arrays.toString(array));
        	}
        		break;
        	}
        }
        System.out.println("Do you want to Sort Again or Exit? [Y] or [N]");
       answer=Input.next().charAt(0);
        
		}while(answer=='Y' || answer=='y');// do while loop
		System.out.println("Thank You for the Participation !!");
        }
}
       


