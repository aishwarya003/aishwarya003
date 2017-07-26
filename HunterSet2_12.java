package Guvi;

import java.util.Scanner;

public class HunterSet2_12 {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int a[]=new int[50];
	int temp;
	for(int i=0;i<50;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<50;i++){
		for(int j=0;j<50;j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	System.out.println("Enter the kth value");
	int k=s.nextInt();
	System.out.println("The height of 4th tallest"+a[3]);
	System.out.println("The height of kth tallest"+a[k-1]);
	s.close();
}
}
