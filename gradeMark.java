package projectUpload;

import java.util.Scanner;

public class gradeMark {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your Mark : ");
		int a=sc.nextInt();
		if (a>=90) {
			System.out.println("A Grade");
		}else if((a>=80) && (a<=90)){
			System.out.println("B Grade");
		}else if((a>=70) && (a<=80)){
			System.out.println("C Grade");
		}else if((a>=60) && (a<=70)){
			System.out.println("D Grade");
		}else if((a>=30) && (a<=60)){
			System.out.println("E Grade  -  The Examiner Should study to improve the mark !!!");
		}
		else {
			System.out.println("The Examinare was Failed !!! ");
		}
	 

	
}
}