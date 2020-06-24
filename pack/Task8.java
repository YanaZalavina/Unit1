package my.pack; // соблюдайте правила именования пакетов и вложенность не менее 4-х для обеспечения уникальности именования
import java.lang.Math;

public class Task8 {
	public static void main(String[] args) {
		double a, b, c, res; //4 äåéñòâèòåëüíûõ ÷èñëà // каждую переменную желательно объявлять в отдельной строке
		
		a=1;
		b=1;
		c=1;
		
		if(a>0) {
			res=(b+Math.sqrt(b*b+4*a*c))/2*a-Math.pow(a, 3)*c+Math.pow(b, -2);// и желательно не слепливать операнды в операторе, например, res=( b + Math.sqrt( b*b + 4*a*c))
		}else {
			System.out.println("Ïåðåìåííàÿ a ðàâíà íóëþ, ýòî íåäîïóñòèìî");
			res=Double.NaN;
		}

		System.out.println("Çíà÷åíèå âûðàæåíèÿ ðàâíî "+res);
	}

}
// В других задачах юнита 1 замечания аналогичные.
