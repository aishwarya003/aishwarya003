package player;

import java.util.Scanner;

public class withoutusingloops {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	printnos(s.nextInt());
}
public static void printnos(int n){
	if(n>0){
		printnos(n-1);
		System.out.println(n);
	}
}
}
