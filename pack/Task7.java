package my.pack;

public class Task7 {
	public static void main(String[] args) {
		double a, sq; //длина и площадь прямоугольника 
		
		a=4.2;
		
		if(a>0) {
			sq=a*(a/2);
		}else {
			System.out.println("Длина прямоугольника равна нулю");
			sq=Double.NaN;
		}

		System.out.println("Длина прямоугольника с длиной "+a+" равна "+sq);
	}

}
