package hunter;

import java.util.Scanner;

public class Set6_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsets("Programming",2);
	}
	public static void subsets(String s,int n){
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++){
		c[i]=s.charAt(i);
		                                
		}
		
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<c.length;j++){
				System.out.print(c[i]);
				System.out.println(c[j]);
			}
		}
	}
}
