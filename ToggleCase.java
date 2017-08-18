package HackerEarth;

public class ToggleCase {
public static void main(String[] args) {
	toggleString("AishWaryA");
}
public static void toggleString(String s){
	char e[]=s.toCharArray();
	for(int i=0;i<e.length;i++){
		if(Character.isLowerCase(e[i])){
			e[i]=Character.toUpperCase(e[i]);
		}
		else if(Character.isUpperCase(e[i])){
			e[i]=Character.toLowerCase(e[i]);
		}
	}
	System.out.println(new String(e));
}
}
