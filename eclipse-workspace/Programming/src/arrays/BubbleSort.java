package arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		//int arr[]= {1,2,4,5,6,3};
		int arr[]= {12,3,4,56,76,320};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
