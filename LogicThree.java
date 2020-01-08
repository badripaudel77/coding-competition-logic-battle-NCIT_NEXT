package logicbattle;

import java.util.Scanner;

public class LogicThree {

	int apowb= 0;
	int mul;

	public void closest(int a,int b,int x) {
	
		apowb = (int) Math.pow(a, b);
	
		
		int mult[] = new int[100];

		
		for(int i = 1;i<mult.length;i++) {
			
			
			
				mult[i] = x*i;
				System.out.println(mult[i]);
	
		
//		System.out.println(mult.length);
//	
//		int len = mult.length;
//		
//		for(int i = 0 ;i<len;i++) {
//					
//			if(i==len-1)
//				System.out.println("closest multiple is" +(len-1));
//
//			
//		}
//		if(mult[i]>=(a+b) && mult[i]<=(a-b)) {
//			System.out.println(mult[i]);
//			
//		}
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,x;
		System.out.println("Enter a , b, x");
		
		a = sc.nextInt();
		b= sc.nextInt();
		
		x= sc.nextInt();
		
		LogicThree obj = new LogicThree();
	
		obj.closest(a, b, x);
		
	}
}
