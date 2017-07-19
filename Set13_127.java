package hunter;
import java.util.*;
public class Set13_127 {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int count=0;
int prime[]=new int[n];
int temp;

for(int i=2;i<n;){
	if(i>1){
	for(int j=1;j<=i;j++){
		if(i%j==0){
			count++;
		prime[i]=i;
		}
	}
}
	

	if(count==2){
		if(prime[i]%10==3){
	System.out.println(prime[i]);
		}
	}
	count=0;
	i++;
	
	}
}
}
		
