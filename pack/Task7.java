package my.pack;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		double rad1, rad2;
		rad1=0;
		rad2=0;
		
		System.out.print("������� ������ ������� �����: ");   
		if (sc.hasNextInt()) {    
			rad1 = sc.nextInt();   
			} 
		System.out.print("������� ������ ������� �����: ");   
		if (sc.hasNextInt()) {    
			rad2 = sc.nextInt();   
			}

		System.out.print(rad1+" "+rad2); 
		
		if(rad1>0&&rad2>0) {
			if((Math.PI*Math.pow(rad1, 2))>(Math.PI*Math.pow(rad2, 2))) {
				System.out.print("������� ������� ����� ������"); 
			}else if((Math.PI*Math.pow(rad1, 2))<(Math.PI*Math.pow(rad2, 2))) {
				System.out.print("������� ������� ����� ������");
			}else if((Math.PI*Math.pow(rad1, 2))==(Math.PI*Math.pow(rad2, 2))) {
				System.out.print("������� �����");
			} 
		}else System.out.print("������� ������������ ������");
	}

}
