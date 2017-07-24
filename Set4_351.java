package hunter;

public class Set4_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleStrings("ababh");
	}
	public static void doubleStrings(String s){
		String res="";
		if(s.substring(0,s.length()/2).equals(s.substring(s.length()/2))){
			 res = "double strings";
		}
		else{
			for(int i=0;i<s.length();i++){
			StringBuffer sb=new StringBuffer(s);
			sb=sb.deleteCharAt(i);
			//System.out.println(sb);
			if(sb.substring(0,sb.length()/2).equals(sb.substring(sb.length()/2))){
				res = "Double string is possible";
			}
			else{
				res= "Double string is not possible";
				}
			}
		}
		System.out.println(res);
	}

}
