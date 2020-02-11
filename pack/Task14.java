package my.pack;
import java.lang.Math;

public class Task14 {
	public static void main(String[] args) {
		double r, l, sq;//радиус, длина и площадь окружности
		
		r=5;
		
		l=2*Math.PI*r;
		sq=Math.PI*Math.pow(r,2);

		System.out.println("Длина и площадь круга равны соответственно "+l+" и "+sq);
	}

}
