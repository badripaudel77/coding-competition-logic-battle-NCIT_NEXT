package logicbattle;

import java.util.Scanner;
public class Summing {

	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
		System.out.println("enter every test cases");
		
		int arr[] = new int[n];
		
		int tn[] = new int[n];
		
        int sum [] = new int[n];
    
        int len = arr.length;
		for(int i = 0; i<n;i++) {
			
			arr[i] = sc.nextInt();
             
			 tn[i] = (int) (Math.pow(arr[i],2)-(Math.pow((arr[i]-1), 2)));	
	         
	         sum[i] = sum[i] + tn[i];
		}
		
		    for(int i = 0; i<len;i++) {
    		System.out.println((int)(sum[i]%(Math.pow(10, 9)+7)));

		}
	}
}
