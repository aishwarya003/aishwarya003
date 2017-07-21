package hunter;

public class Set8_72 {
public static void main(String[] args){
	reversetheoddposition("This is an example for this question");
	
}
public static void reversetheoddposition(String s){
	int c=s.indexOf(" ");
	int countb=0,countcc=0;;
	String a[]=s.split(" ");
	
	
	int ss=1;
	//System.out.println(s.length());
	String b[]=new String[a.length];
	String cc[]=new String[a.length];
	for(int i=0;i<a.length;i++){
		//System.out.println(a[i]);
		
		if(i%2==0){
			b[i]=a[i];
			StringBuffer sb=new StringBuffer(b[i]);
			System.out.print(sb.reverse());
			System.out.print(" ");
			countb++;
			//System.out.println(b[i]);
		}
		if(i%2!=0){
			cc[i]=a[i];
			countcc++;
			System.out.print(cc[i]);
			System.out.print(" ");
		}
	}
	
}
}

