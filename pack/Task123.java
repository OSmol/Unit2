package my.pack;
import java.util.Scanner;

public class Task123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		int number1 = 0;
		int number2=0;
		int dif=0;
		
		System.out.print("������� ������ �����: ");   
		if (sc.hasNextInt()) {    
			number1 = sc.nextInt();   
			} 
		
		System.out.print("������� ������ �����: ");   
		if (sc.hasNextInt()) {    
			number2 = sc.nextInt();   
			}
		 
		  dif = number1-number2;   
		  if(dif == 0) {
			  System.out.print("����� "+number1+" � "+number2+" �����"); 
		  } else if(dif>0) {
			  System.out.print("����� "+number1+" ������ ����� "+number2); 
		  }else if(dif<0) {
			  System.out.print("����� "+number1+" ������ ����� "+number2); 
		  }
	}
}
