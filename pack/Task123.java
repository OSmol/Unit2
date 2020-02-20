package my.pack;
import java.util.Scanner;

public class Task123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		int number1 = 0;
		int number2=0;
		int dif=0;
		
		System.out.print("¬ведите первое число: ");   
		if (sc.hasNextInt()) {    
			number1 = sc.nextInt();   
			} 
		
		System.out.print("¬ведите второе число: ");   
		if (sc.hasNextInt()) {    
			number2 = sc.nextInt();   
			}
		 
		  dif = number1-number2;   
		  if(dif == 0) {
			  System.out.print("„исла "+number1+" и "+number2+" равны"); 
		  } else if(dif>0) {
			  System.out.print("„исло "+number1+" больше числа "+number2); 
		  }else if(dif<0) {
			  System.out.print("„исло "+number1+" меньше числа "+number2); 
		  }
	}
}
