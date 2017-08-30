package player;
import java.util.*;
public class BeforeAndAfterInterchange {
public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
String ss=s.nextLine();
String temp="";

String s1[]=ss.split(" ");
for(int i=0;i<s1.length;i++){
	if(s1[i].equals("and")){
		temp=s1[i-1];
		s1[i-1]=s1[i+1];
		s1[i+1]=temp;
	}
}
for(int i=0;i<s1.length;i++){
System.out.println(s1[i]);}
}
}
