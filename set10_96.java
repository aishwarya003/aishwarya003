package hunter;

public class set10_96 {
public static void main(String[] args){
	encryption("java");
}
public static void encryption(String s){
	char a[]=s.toCharArray();
	int ss[]=new int[s.length()];
	char aa=s.charAt(s.length()-1);
	for(int i=0;i<s.length();i++){
		ss[i]=Integer.valueOf(a[i]);
	}
		System.out.print((char)(ss[0]-1));
		if((char)ss[1]=='a'){
			System.out.print((char)(ss[1]+25));
		}
		else
		{
			System.out.print((char)(ss[1]-1));
		}
		System.out.print((char)(ss[2]-1));
		System.out.print(aa);
}
}
