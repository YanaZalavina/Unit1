package my.pack;
import java.lang.Math;

public class Task10 {
	public static void main(String[] args) {
		double x, y, res; 
		
		x=Math.toRadians(2);
		y=Math.toRadians(2);
		
		double temp=Math.cos(x)-Math.sin(y);
		
		if(temp!=0) {
			res=((Math.sin(x)+Math.cos(y))/temp)*Math.tan(x*y);
		}else {
			System.out.println("Выражение cos(x)-sin(y) равно нулю");
			res=Double.NaN;
		}

		System.out.println("Значение выражения ((sin(x)+cos(y))/(cos(x)-sin(y)))*tan(x*y) равно "+res);
	}



}
