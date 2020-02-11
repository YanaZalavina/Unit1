package my.pack;
import java.lang.Math;

public class Task11 {
	public static void main(String[] args) {
		double a, b, c, sq, p;//катеты, гипотенуза, площадь и периметр прямоугольного треугольника 
		
		a=2;
		b=2;
		c=Math.sqrt(a*a+b*b);
		
		sq=a*b*0.5;
		p=a+b+c;

		System.out.println("Площадь треугольника равна "+sq+", периметр равен "+p);
	}


}
