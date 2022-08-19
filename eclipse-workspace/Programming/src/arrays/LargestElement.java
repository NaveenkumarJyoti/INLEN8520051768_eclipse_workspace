package arrays;

public class LargestElement {
	public static void main(String[] args) {
		int arr[]= {9,34,654,33,2,0,2345},max=arr[0];
		
		for(int i=0;i<arr.length;i++) 
			for(int j=i+1;j<arr.length;j++) 
				if(max<arr[j]) 
					max=arr[j];
		
		System.out.println(max);
	}
}
