package arrays;
import java.util.Arrays;
public class Seggregate1sand0s {
	public static void main(String[] args) {
		int[] seg= {0,1,1,0,0,1,0,1};

		//Seggregating 1s and 0s
		for(int i=0;i<seg.length;i++) {
			for(int j=i+1;j<seg.length;j++) {
				if(seg[i]>seg[j]) {
					int temp=seg[i];
					seg[i]=seg[j];
					seg[j]=temp;
				}
			}
		}

		//Printing Seggregated array
		System.out.println(Arrays.toString(seg));
	}
}
