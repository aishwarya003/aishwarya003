package hunter;

import java.util.Scanner;

public class Set09_85 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=21;
	int[] a=new int[n];
	int count=1;
	String num="";
	for(int i=2;i<=n;i++){
		
		num+=i;
	}
	System.out.println(num);
	for(int i=0;i<=n;i++){
	if(num.charAt(i)=='2'){
		count++;
	}
	}
	System.out.println(count);

}
}
