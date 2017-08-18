package player;
import java.util.*;
public class set20_200 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String as=s.next();
	int n=s.nextInt();
	int temp=n;
	char c=as.charAt(as.length()-1);//System.out.println(c);
	int sum=0,sum1=0;
	while(n>0){
		sum+=n%10;
		n/=10;
	}
	while(sum>0){
		sum1+=sum%10;
		sum/=10;
	}
	char a=as.charAt(0);
	if(Character.isUpperCase(a)){
		a=Character.toLowerCase(a);
	}
	else{
		a=a;
	}
	int es=0;
	while(temp>0){
		es=temp%10;
		temp/=10;
	}
	System.out.print(es);
	System.out.print(a);
	System.out.print(sum1);
	System.out.print(c);
}
}
