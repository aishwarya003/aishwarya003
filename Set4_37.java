package hunter;

import java.util.Scanner;
public class Set4_37 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String ss=s.next();
	String f=ss.substring(0,ss.length()/2);
	String g=ss.substring(ss.length()/2);
	if(f.length()==g.length()){
		StringBuffer sb=new StringBuffer(ss);
		
		System.out.println(sb.delete(sb.length()/2, sb.length()/2+1));
		
	}
}
}