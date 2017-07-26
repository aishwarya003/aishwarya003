package Guvi;

import java.util.Scanner;

public class Hunterset1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int temp;
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		/*for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
		
		}*/
		String aa=a.toString();
		for(int i=0;i<n;i++){
			//System.out.println(a[i]);
			if(a[i]==i){
				System.out.println("The number "+a[i]+" equals "+i);
				
			}
			
		}
	}

}
