package my.pack;
import java.util.Scanner;
import java.lang.Math;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		double number1 = 0;
		double number2=0;
		double dif=0;
		
		System.out.print("������� ������ �����: ");   
		if (sc.hasNextInt()) {    
			number1 = sc.nextInt();   
			} 
		
		System.out.print("������� ������ �����: ");   
		if (sc.hasNextInt()) {    
			number2 = sc.nextInt();   
			}
		 
		  dif = Math.pow(number1, 2)-Math.pow(number2, 2);   
		  if(dif<0) {
			  System.out.print("������� ����� "+number1+" ����������"); 
		  } else if(dif>0) {
			  System.out.print("������� ����� "+number2+" ����������"); 
		  }else if(dif==0) {
			  System.out.print("�������� ����� �����");
		  } 
	}

}
