package my.pack;
import java.lang.Math;

public class Task13 {
	public static void main(String[] args) {
		double x1, y1, x2, y2, x3, y3, p, sq, a, b, c;//координаты точек, периметр и площадь треугольника, длины сторон треугольника
		
		x1=2;
		y1=2;
		x2=3;
		y2=5;
		x3=1;
		y3=5;
		
		a=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		b=Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
		c=Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
		
		p=a+b+c;
		sq=Math.sqrt((p/2)*(p/2-a)*(p/2-b)*(p/2-c));

		System.out.println("Площадь и периметр треугольника соответственно равен "+sq+" и "+p);
	}

}
