package hunter;

import java.util.Scanner;

public class Set5_48 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String ss=s.next();
	String sub=s.next();
	if(ss.contains(sub)){
		System.out.println(ss.indexOf(sub));
	}
	else{
		System.out.println("-1");
	
}
}
}
