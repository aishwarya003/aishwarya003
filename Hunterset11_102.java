package Guvi;

public class Hunterset11_102 {
public static void main(String[] args){
	String n="12345";
	int a=0;
	for(int i=n.length();i>=0;i--){
		for(int j=0;j<i;j++){
			a+=Integer.valueOf(n.substring(j,j+1));
		}
		
}
	System.out.println(a);}
}
