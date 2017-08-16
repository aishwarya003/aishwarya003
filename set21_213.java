package player;

import java.util.*;

public class set21_213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String ss=s.next();
		char[] b=ss.toCharArray();
		Set<Character> s1=new LinkedHashSet<Character>();
		for( int i = 0 ; i < b.length ; i++ ) {
			s1.add( b[i] );
		}
		Iterator<Character> i = s1.iterator();
		while( i.hasNext() ) {
			System.out.print( i.next() );
		}
	}
}
		
