package player;
import java.util.*;
public class Set21_202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ss=new Scanner(System.in );
String s=ss.next();
String a="";
String b="";
char b1[]=s.toCharArray();
for(int i=0;i<s.length();i++){
	if((b1[i]=='a'||b1[i]=='e'||b1[i]=='i'||b1[i]=='o'||b1[i]=='u')||(b1[i]=='A'||b1[i]=='E'||b1[i]=='I'||b1[i]=='O'||b1[i]=='U')){
		a+=b1[i];
	}
	else{
		b+=b1[i];
	}
}System.out.print(a);
System.out.println(b);
	}

}
