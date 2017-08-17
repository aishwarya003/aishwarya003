package Guvi;
import java.util.*;
public class set21_210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Set<Integer> s1=new TreeSet<Integer>();
for(int i=0;i<n;i++){
	s1.add(s.nextInt());
}
Iterator<Integer> it=s1.iterator();
while(it.hasNext()){
	System.out.print(it.next());
}

	}

}
