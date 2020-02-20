package my.pack;
import java.util.Scanner;
import java.lang.Math;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		double number1, number2, number3, number4, res;
		number1=0;
		number2=0;
		number3=0;
		number4=0;
		
		System.out.print("Введите первое число: ");   
		if (sc.hasNextInt()) {    
			number1 = sc.nextInt();   
			} 
		System.out.print("Введите второе число: ");   
		if (sc.hasNextInt()) {    
			number2 = sc.nextInt();   
			}
		System.out.print("Введите третье число: ");   
		if (sc.hasNextInt()) {    
			number3 = sc.nextInt();   
			}
		System.out.print("Введите четвертое число: ");   
		if (sc.hasNextInt()) {    
			number4 = sc.nextInt();   
			}
		
		res=Math.abs(number1*Math.pow(number4, 2)+(number2*number4)+number3);     
		System.out.print("Модуль выражения равен "+res); 

	}

}
