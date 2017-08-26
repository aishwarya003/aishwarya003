package Guvi;
import java.util.*;
public class Conversionbintoint {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	String output=Integer.toBinaryString(a);
	String output1=Integer.toBinaryString(b);
	System.out.println((String.format("%14s", output)).replace(" ","0"));
	System.out.println((String.format("%14s", output1)).replace(" ","0"));
}
}
