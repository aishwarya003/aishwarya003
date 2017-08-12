package Programs;

public class AreaOfShapes {
public static float area;
public static void main(String[] args) {
	circle(3);
	rectangle(4,7);
	triangle(3,4);
}
public static void circle(float radius){
	 area=(float) (3.14*radius*radius);
	 System.out.println(area);
}
public static void rectangle(float length,float breadth){
	area=(float)length*breadth;
	System.out.println(area);
}
public static void triangle(float base,float height){
	area=(float)(0.5*base*height);
	System.out.println(area);
}

}
