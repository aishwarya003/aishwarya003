package Guvi;
import java.util.*;
class Hunter12_115{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		String res="";
		int g=1;
		if(a.length()<b.length()){
			for(int i=0;i<b.length();i++){
				if(i<a.length()){
					res+=a.charAt(i);
					res+=b.charAt(i);
				}else{
					res+=(g++);
					res+=b.charAt(i);
				}
			}
			
		}
		else{
			for(int i=0;i<b.length();i++){
				if(i<b.length()){
					res+=a.charAt(i);
					res+=b.charAt(i);
				}else{
					
					res+=a.charAt(i);
					res+=(g++);
				}
		}
	}
		System.out.println(res);
}
}