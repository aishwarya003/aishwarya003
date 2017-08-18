package guvi;

import java.util.Scanner;

public class set21_207 {
	public static void main(String[] args){

		Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int y=0;y<n;y++){
		a[y]=s.nextInt();
	}
	s.close();
	
	int i;
	int j;
	int t;
	int c;
	int count[]=new int[10];
	
	int rem[]=new int[10];
	for(i=0;i<n;i++){
	
		for(j=0;j<=9;j++){
			t=a[i];
			//count[j]=0;
			while(t>0){
				rem[j]=t%10;
				if(rem[j]==j){
					count[j]++;
				}
				t/=10;
			}
			if(count[j]%2!=0){
				System.out.println(rem[j]);
				break;
			}
}
	}
	}
}
