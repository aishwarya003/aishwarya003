package player;
import java.util.*;
public class Set21_201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String ss=s.nextLine();
		String w[]=ss.split(" ");
		//for(int i=0;i<w.length;i++){System.out.println(w[i]);}
		String t="";
		String g="";
		int tt;
		String hh[]=new String[w.length];
		int sum[]=new int[w.length];
		int sum1[]=new int[w.length];
		for(int i=0;i<w.length;i++){
			//System.out.println(w[0]);
			t=w[i];
		 g=t.substring(t.length()-4, t.length());
		 hh[i]=g;
		
		}
		for(int i=0;i<hh.length;i++){
			tt=Integer.valueOf(hh[i]);
			while(tt>0){
			sum[i]+=(tt%10);
			tt/=10;
		}
			while(sum[i]>0){
				sum1[i]+=(sum[i]%10);
			
				sum[i]/=10;
		}
			
		}
		for(int i=0;i<sum1.length;i++){
			if(sum1[i]==5||sum1[i]==7){
				System.out.println(w[i]);
			}
			else if
			(!(sum1[i]==5||sum1[i]==7)){
				System.out.println(sum1[i]);
			}
		}
		
	}

}
