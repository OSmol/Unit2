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
			System.out.print("”кажите a: "); 
			side1 = sc.nextInt(); 		
		{
			if (side1>0) {    
				res1=false;
				
			}else {
				res1=true;
				System.out.print("”кажите a>0! ");
				}
			}
		}
		while(res1) ;
		
		do {
			System.out.print("”кажите b: ");
			side2 = sc.nextInt(); 
		
		 {
				if (side2>0) {    
					res2=false;
					
				}else {
					res2=true;
					System.out.print("”кажите b>0! ");
					}
			}
		 }
		while(res2);
		
		
		do	{
			System.out.print("”кажите c: ");
			side3 = sc.nextInt();
			
			if (side3>0) {    
				res3=false;
				 }else {
				res3=true;
				System.out.print("”кажите c>0! ");
				}
		}
		while(res3);
		
		 
		   
		  if((side1==side2)&&(side2==side3)) {
			  System.out.print("“реугольник равносторонний"); 
		  } else {
			  System.out.print("“реугольник не равносторонний"); 
		  }
		}
	}


