package logicbattle;

import java.util.Scanner;

public class LogicBattleOne {

	int num;
	int mindraw;
	 public void calculate() {
		 //System.out.println("from the calculate method just to check");
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter number");
		 
		 num = sc.nextInt();
		 
		 int samp[] = new int[num];
		 System.out.println("enter sample test cases");

		 for(int i =0;i<samp.length;i++) {
			 samp[i] = sc.nextInt();
			
		 }
		 
		 for(int i =0;i<samp.length;i++) {
		 
			 samp[i] = samp[i] +1;
			 System.out.println(samp[i]);
			 
		 }
	 }
	
	public static void main(String[] args) {

		LogicBattleOne  logicOne = new LogicBattleOne();
		logicOne.calculate();
	}

}
