package Guvi;
import java.util.*;
public class HunterSet9_88 {
	public static void main(String[] arge){
		reverse("aaaabgfrfffffrd");
	}
		public static void reverse(String s){
		HashSet<Character> hs=new HashSet<Character>();
		StringBuffer  sb=new StringBuffer(s);
		sb=sb.reverse();
		for(int i=0;i<sb.length();i++){
			if(hs.add(sb.charAt(i))){
				System.out.print(sb.charAt(i));
			}
		}
		}
}

