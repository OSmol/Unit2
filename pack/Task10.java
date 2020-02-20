package my.pack;
import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

public class Task10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		double a,b,c,d, max;
		a=0;
		b=0;
		c=0;
		d=0;
		max=0;
		
		System.out.print("¬ведите 4 действительных числа через пробел: ");   
		if (sc.hasNextInt()) { 
			try {
					a=sc.nextInt();
					b=sc.nextInt();
					c=sc.nextInt();
					d=sc.nextInt();
					max=Math.max(Math.min(a, b), Math.min(c, d));
					System.out.print("–езультат выражени€ max{min("+a+", "+b+"), min("+c+", "+d+")} соответствует значению "+max);
				}catch (InputMismatchException error) {
					System.out.print("¬ведены некорректные числа");
				}
			}   
	}
}
