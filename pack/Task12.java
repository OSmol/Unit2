package my.pack;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		String enter = null;
		
		System.out.print("Введите строку: ");   
		if (sc.hasNext()) { 
				enter=sc.next();
			}  
		
		//преобразовываем строку в массив
        char[] result=enter.toCharArray();  
        
        //анализируем 1-й элемент
        int ascii_code = (int)result[0];
        if(ascii_code==95||Character.isLetter(result[0])) {
    		System.out.println("Первый символ "+result[0]+" входит в число допустимых символов"); 
        }else if(true){
        	System.out.println("Первый символ "+result[0]+" не входит в число допустимых"); 
        	}
		
        //анализируем остальные символы
		for(int i=1;i<result.length;i++) {
			if(ascii_code==95||Character.isLetter(result[i])||Character.isDigit(result[i])) {
				System.out.println("Cимвол "+result[i]+" входит в число допустимых символов"); 
			}else if(true) {
				System.out.println("Cимвол "+result[i]+" не входит в число допустимых"); 
			}
		}
	}

}
