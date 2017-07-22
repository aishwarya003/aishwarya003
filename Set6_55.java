package hunter;

import java.util.Scanner;

public class Set6_55 {
public static void main(String [] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter size");
	int n=s.nextInt();
	System.out.println("Enter d");
	int d=s.nextInt();
	int a[]=new int [n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(int i=d;i<n;i++){
		System.out.println(a[i]);
	}
	for(int i=0;i<d;i++){
		System.out.println(a[i]);
	}
}
}

