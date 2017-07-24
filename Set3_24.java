package hunter;

import java.util.Scanner;

public class Set3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter target");
		int num=s.nextInt();
		int sum[]=new int[n];
		System.out.println("Array elements");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]+a[j]==num){
					System.out.println(a[i]+"+"+a[j]+"is added to get a target"+num);
					break;
				}
			}
		}

	}
}
