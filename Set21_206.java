package player;

import java.util.Scanner;

public class Set21_206 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();	
	int sum=0;
	int rem;
	
	for(int i=0;i<n+"".length();i++) {
		rem=n%10;
		if(rem%2==0) {
			sum=sum+rem;
		}
		n=n/10;
		
	}
	System.out.println(+sum);
	

}

	
}

