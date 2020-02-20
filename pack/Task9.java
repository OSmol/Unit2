package my.pack;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   

		double a, b, c;
		a=0;
		b=0;
		c=0;
		
		System.out.print("Введите 3 действительных числа через пробел: ");   
		if (sc.hasNextInt()) {    
				a=sc.nextInt();
				b=sc.nextInt();
				c=sc.nextInt();
			} 
		
		ArrayList<Double> list = new ArrayList<Double>();	
		ArrayList<Double> result = new ArrayList<Double>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		System.out.println("Введенный массив чисел: "); 
		for(int i=0;i<list.size();i++) {
			double temp=list.get(i);
			System.out.println(temp);
			}
		
		for(int i=0;i<list.size();i++) {
			double temp=0;
			temp=list.get(i);
			if(temp>0||temp==0) {
				double tt=temp*temp;
				result.add(i, (tt));
			}else if(temp<0) {
				double tt=Math.pow(temp, 4);
				result.add(i, (tt)); 
			}else System.out.println("Введены некорректные значения"); 
		}
		
		System.out.println("Получившийся массив чисел: "); 
		for(int i=0;i<result.size();i++) {
			double temp=result.get(i);
			System.out.println(temp);
			}
	}
}
