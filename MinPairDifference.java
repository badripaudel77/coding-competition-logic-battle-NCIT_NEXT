package rapidcodingchallenge;
import java.util.*;
public class MinPairDifference {

    Scanner sc = new Scanner(System.in);
    int n;
    
	public void doOperation() {
	System.out.println("Enter the no of elements ! ");	
	n= sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter every elements ");
	
	for(int i = 0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	
	int min = Integer.MAX_VALUE;
	
	for(int j=0;j<n;j++) {
		for(int k = j+1; k<n; k++) {
			
			if(Math.abs(arr[j]-arr[k])<min) {
				
				min = Math.abs(arr[k]-arr[j]);
			}
		}
	}
	
	System.out.println("Minimum difference of two possible pair is " + min);
	
	}
	
	public static void main(String[] args) {

		MinPairDifference minDiff = new MinPairDifference();
		
		minDiff.doOperation();
		
	}

}
