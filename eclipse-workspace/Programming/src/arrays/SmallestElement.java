package arrays;

public class SmallestElement {
	public static void main(String[] args) {
		int arr[]= {9,34,654,33,2,2345},min=arr[0];
		
		for(int i=0;i<arr.length;i++) 
			for(int j=i+1;j<arr.length;j++) 
				if(min>arr[j]) 
					min=arr[j];
		
		System.out.println(min);
	}
}