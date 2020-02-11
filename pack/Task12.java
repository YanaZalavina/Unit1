package my.pack;
import java.lang.Math;

public class Task12 {
	public static void main(String[] args) {
		double x1, y1, x2, y2, dist;//координаты точек, расстояние между ними
		
		x1=2;
		y1=2;
		x2=3;
		y2=5;
		
		dist=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

		System.out.println("Расстояние между точками ("+x1+", "+y1+") и ("+x2+", "+y2+") равно "+dist);
	}

}
