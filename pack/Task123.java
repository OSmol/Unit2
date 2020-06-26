package my.pack;
import java.util.Scanner;

public class Task123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		int number1 = 0;
		int number2=0;
		int dif=0;
		
		System.out.print("Ââåäèòå ïåðâîå ÷èñëî: ");   
		if (sc.hasNextInt()) {    
			number1 = sc.nextInt();   
			} 
		
		System.out.print("Ââåäèòå âòîðîå ÷èñëî: ");   
		if (sc.hasNextInt()) {    
			number2 = sc.nextInt();   
			}
		 
		  dif = number1-number2;   
		  if(dif == 0) {
			  System.out.print("×èñëà "+number1+" è "+number2+" ðàâíû"); 
		  } else if(dif>0) {
			  System.out.print("×èñëî "+number1+" áîëüøå ÷èñëà "+number2); 
		  }else if(dif<0) {
			  System.out.print("×èñëî "+number1+" ìåíüøå ÷èñëà "+number2); 
		  }
	}
}
// Значимых замечаний по задачам модуля 2 нет. Только уровни пакетов (не менее 4), соблюдайте.
