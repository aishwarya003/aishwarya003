package hunter;

import java.util.*;

public class Set13_128 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int temp;
	
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=i;j<n;j++){
			if(a[i]<a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	/*for(int i=0;i<n;i++){
		for(int j=i;j<n;j++){
			if(a[i]<a[j]){
				temp1[i]=a[i];
				a[i]=a[j];
				a[j]=temp1[i];
			}
		}
	}*/
	
	for(int i=0;i<n;){
		System.out.print(a[i]+",");
		System.out.print(+a[n-(i+1)]+",");
		i++;
	}
}
}
