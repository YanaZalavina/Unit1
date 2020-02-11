package my.pack;

public class Task9 {
	public static void main(String[] args) {
		double a, b, c, d, res; //5 действительных чисел
		
		a=1;
		b=1;
		c=1;
		d=2;
		
		if(c>0&&d>0) {
			res=-1/d;
		}else {
			System.out.println("ѕеременные с или в равны нулю, это недопустимо");
			res=Double.NaN;
		}

		System.out.println("«начение выражени€ (a/c)*(b/d)-(a*b-c)/cd равно "+res);
	}


}
