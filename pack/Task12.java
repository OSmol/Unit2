package my.pack;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		String enter = null;
		
		System.out.print("������� ������: ");   
		if (sc.hasNext()) { 
				enter=sc.next();
			}  
		
		//��������������� ������ � ������
        char[] result=enter.toCharArray();  
        
        //����������� 1-� �������
        int ascii_code = (int)result[0];
        if(ascii_code==95||Character.isLetter(result[0])) {
    		System.out.println("������ ������ "+result[0]+" ������ � ����� ���������� ��������"); 
        }else if(true){
        	System.out.println("������ ������ "+result[0]+" �� ������ � ����� ����������"); 
        	}
		
        //����������� ��������� �������
		for(int i=1;i<result.length;i++) {
			if(ascii_code==95||Character.isLetter(result[i])||Character.isDigit(result[i])) {
				System.out.println("C����� "+result[i]+" ������ � ����� ���������� ��������"); 
			}else if(true) {
				System.out.println("C����� "+result[i]+" �� ������ � ����� ����������"); 
			}
		}
	}

}
