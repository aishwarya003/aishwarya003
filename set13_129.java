package hunter;
import java.util.*;
public class set13_129 {
public static void ascii(String s){
char c[]=new char[s.length()];
int ascii[]=new int[s.length()];
int diff[]=new int[s.length()];
int sum=0;
for(int i=0;i<s.length();i++){
c[i]=s.charAt(i);

ascii[i]=Integer.valueOf(c[i]);
//System.out.println(ascii[i]);
}

for(int i=1;i<s.length();i++){
	diff[i-1]=ascii[i]-ascii[i-1];
	//System.out.println(diff[i-1]);
	sum+=diff[i-1];
	
}//System.out.println(sum);
ascii[0]=sum-ascii[0];
if(ascii[0]<0){
	ascii[0]=Math.abs(ascii[0]+26);
}
else if(ascii[0]>122){
	ascii[0]=Math.abs(ascii[0]-26);
}
System.out.println((char)(ascii[0]));

}
public static void main(String[] args){
	ascii("aishu");
}
}
