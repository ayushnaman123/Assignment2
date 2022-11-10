package iNeuron.ai;

import java.util.Arrays;

public class Sort_an_array_using_Quick_Sort {
	
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				
				//swap 
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i; //pivot index
	}
	
	public static void quickSort(int arr[], int low, int high) {
		if(low < high) {
			int pidx = partition(arr, low, high);
			
			quickSort(arr, low, pidx-1);
			quickSort(arr, pidx+1, high);
		}
	}

	public static void main(String[] args) {
       int[] arr = {35,30,40,20,10,25,15,22};
       int n = arr.length;
       System.out.println("Before sorting");
       System.out.println(Arrays.toString(arr));
       
       quickSort(arr, 0, n-1);
       
       System.out.println("After sorting");
       for(int i=0; i<n; i++) {
    	   
    	   System.out.print(arr[i]+" ");
       }
       System.out.println();

	}

}
