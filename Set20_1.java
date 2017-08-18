package player;
import java.util.*;
public class Set20_1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int d=0;
	for(int i=n;;i++){
		if(((i%4==0)&&(i%100!=0))||(i%400==0)){
			d++;
			System.out.println(i);
		}
		if(d>19){
			break;
		}

	}
}
}
