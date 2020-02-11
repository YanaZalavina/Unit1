package my.pack;

public class Task1 {
	public static void main(String[] args) {
		double x,y; //2 действительных числа
		double sum, ded, mul, div;
		
		x=2.5;
		y=-25;
		
		sum=x+y;
		ded=x-y;
		mul=x*y;
		if(y!=0) {
			div=x/y;
		}else {
			System.out.println("«наменатель равен нулю");
			div=Double.NaN;
		}
		
		System.out.println("sum = "+sum+", ded = "+ded+", mul = "+mul+", div = "+div);
		
	}

}
