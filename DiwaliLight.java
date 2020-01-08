package logicbattle;

import java.util.Scanner;

public class DiwaliLight {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
		int arr[] = new int[n];

		int res[] = new int[n];
		System.out.println("enter every test cases");
		int len = arr.length;

		for (int i = 0; i < len; i++) {

			arr[i] = sc.nextInt();

			res[i] = (int) (Math.pow(2,arr[i]) - 1);//2^n -1
		}
		int len1 = res.length;
		for (int i = 0; i < len1; i++) {
			
			System.out.println(res[i]);
		}
	}

}
