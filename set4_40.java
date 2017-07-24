package hunter;

import java.util.Scanner;

public class set4_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ss=n;
		int sum1=0,rev=0,temp;
		while(ss>0){
			sum1=sum1+(ss%10);
			ss/=10;
		}
		System.out.println(sum1);
		int sum2=sum1;
		while(sum1>0){
			rev=(rev*10)+(sum2%10);
			sum1/=10;
		}
		System.out.println(rev);
		if(sum1==rev){
			System.out.println("palindrome");
		}else{
			System.out.println("not a palindrome");
		}
	}

}
