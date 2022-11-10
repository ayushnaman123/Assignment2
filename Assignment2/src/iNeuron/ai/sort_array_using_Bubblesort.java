package iNeuron.ai;

import java.util.Arrays;

public class sort_array_using_Bubblesort {

	public static void main(String[] args) {
        int[] a= {55, 87, 67, 54, 43, 32, 45, 57, 84, 93 ,22};
        int n = a.length;
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(a));
        
       
		
		for(int i=0;i<n;i++) 
		{
			for(int j=1;j<n-i;j++){
				
				if(a[j]<a[j-1])
				{
					int tempVar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempVar;
				}
			}
		}
		System.out.println("After Sorting: " );
		for(int el:a)
		{
			
			System.out.print(el+" ");
		}
	

	}

}
