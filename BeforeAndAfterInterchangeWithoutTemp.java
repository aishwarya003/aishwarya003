package player;
import java.util.*;
public class BeforeAndAfterInterchangeWithoutTemp {
public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
String ss=s.nextLine();


String s1[]=ss.split(" ");
String s2[]=ss.split(" ");
for(int i=0;i<s1.length;i++){
	if(s1[i].equals("and")){
		s1[i-1]=s1[i+1];
		s1[i+1]=s2[i-1];
	}
}
for(int i=0;i<s1.length;i++){
System.out.println(s1[i]);
}
}
}
