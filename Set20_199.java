package player;
import java.util.*;

public class Set20_199 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Set<String> s1=new LinkedHashSet<String>();
	int n=s.nextInt();
	for(int i=0;i<n;i++){
		s1.add(s.next());
	}
	System.out.println(s1);
	s.close();
}
}
