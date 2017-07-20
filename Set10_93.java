package hunter;
import java.util.*;
public class Set10_93 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String ss="Welcome To Java World";
	String s1="";
	String splitt[]=ss.split(" ");
	//for(int i=0;i<=ss.length()-1;i++)
	for(String aa:splitt){
		StringBuffer sb=new StringBuffer(aa);
		s1+=sb.reverse().toString();
		s1+=" ";
		
	}
	System.out.println(s1);
	
}
}
