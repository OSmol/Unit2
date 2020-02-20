package my.pack;
import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		double a, b, c, p, p1, a1, b1, c1, sq, sq1;
		a=0;
		b=0;
		c=0;
		a1=0;
		b1=0;
		c1=0;
		
		System.out.print("¬ведите длины сторон первого треугольника через пробел: ");   
		if (sc.hasNextInt()) {    
			a = sc.nextInt(); 
			b=sc.nextInt(); 
			c=sc.nextInt(); 
			}   
		
		System.out.print("¬ведите длины сторон второго треугольника через пробел: ");   
		if (sc.hasNextInt()) {    
			a1 = sc.nextInt(); 
			b1=sc.nextInt(); 
			c1=sc.nextInt();    
			}
		
		if(a>0&&b>0&&c>0&&a1>0&&b1>0&&c1>0) {
			p=a+b+c;
			p1=a1+b1+c1;
			sq=Math.sqrt((p/2)*(p/2-a)*(p/2-b)*(p/2-c));
			sq1=Math.sqrt((p1/2)*(p1/2-a1)*(p1/2-b1)*(p1/2-c1));
			if(sq>sq1) {
				System.out.print("ѕлощадь первого треугольника больше"); 
			}else if(sq<sq1) {
				System.out.print("ѕлощадь второго треугольника больше"); 
			}else if(sq==sq1) {
				System.out.print("ѕлощади треугольников равны"); 
			}
		}else System.out.print("¬ведены некорректные длины сторон треугольника");   

	}


}
