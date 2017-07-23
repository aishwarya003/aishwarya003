package Guvi;

import java.util.*;

public class HunterSet5_43 {
	public static char res;
	public static void main(String[] args){
		numberprint("a2d4");
	}
		public static void numberprint(String a){
		int n[]=new int[10];
		
		int k=0;
		String res="";
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)>='1'&&a.charAt(i)<='9'){
				n[k]=a.charAt(i)-48;
				
				
				for(int j=0;j<n[k];j++){
					res+=a.charAt(i-1);
				}
				k++;
			}
		}
		System.out.println(res);
			}

		}


