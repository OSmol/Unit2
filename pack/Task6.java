package my.pack;
import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		double side1 = 0;
		double side2=0;
		double side3=0;
		boolean res1 = true;
		boolean res2 = true;
		boolean res3 = true;
		
		do {
			System.out.print("������� a: "); 
			side1 = sc.nextInt(); 		
		{
			if (side1>0) {    
				res1=false;
				
			}else {
				res1=true;
				System.out.print("������� a>0! ");
				}
			}
		}
		while(res1) ;
		
		do {
			System.out.print("������� b: ");
			side2 = sc.nextInt(); 
		
		 {
				if (side2>0) {    
					res2=false;
					
				}else {
					res2=true;
					System.out.print("������� b>0! ");
					}
			}
		 }
		while(res2);
		
		
		do	{
			System.out.print("������� c: ");
			side3 = sc.nextInt();
			
			if (side3>0) {    
				res3=false;
				 }else {
				res3=true;
				System.out.print("������� c>0! ");
				}
		}
		while(res3);
		
		 
		   
		  if((side1==side2)&&(side2==side3)) {
			  System.out.print("����������� ��������������"); 
		  } else {
			  System.out.print("����������� �� ��������������"); 
		  }
		}
	}


