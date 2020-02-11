package my.pack;

public class Task6 {
	public static void main(String[] args) {
		int n, m; //количество малых и больших бидонов соответственно
		double liter_count; //количество литров в больших бидонах
		
		n=0;
		m=2;
		if(n>0&&m>0) {
				liter_count=(80/n+12)*m;
		}else {
			System.out.println("Количество малых или больших бинов равно нулю");
			liter_count=Double.NaN;
		}

		System.out.println("Количество литров молока в больших бидонах равно "+liter_count);
	}

}
