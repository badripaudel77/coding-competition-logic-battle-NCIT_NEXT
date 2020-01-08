package logicbattle;
import java.util.Scanner;

public class LogicBattleSix {

	private Scanner sc;

	public void calc() {
		sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("enter 5 elements");
		
		int len = arr.length;
		for(int i = 0; i<len;i++) {
			
			arr[i] =sc.nextInt();
		}
		
		for(int j = 0;j<len;j++) {
			
			for(int k=j+1; k<len;k++) {
				arr[j] = arr[j] + arr[k-1];
				
			}
		}
		for(int j = 0;j<len;j++) {
		System.out.println(arr[j]);
		}
	}
	
	public static void main(String[] args) {
		LogicBattleSix obj = new LogicBattleSix();
		obj.calc();
		
		
	}

}
