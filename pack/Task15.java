package my.pack;

import java.util.ArrayList;

public class Task15 {
	public static void main(String[] args) {
		int min = 10; 
	    int max = 10000; 
	    int col=0;
	    ArrayList<Integer> numbers= new ArrayList<Integer>();
	      
	    int x = min + (int) (Math.random() * max);
	    System.out.println("Сгенерировано число: "+x);
        
	    //разбиваем число на отдельные цифры и записываем в массив
        while (x != 0) {
        	numbers.add(x % 10);
        	x /= 10;
        }
      
        //ищем четные цифры и считаем их количество
        for(int i=0;i<numbers.size();i++) {
            	if(numbers.get(i)!=0&&numbers.get(i)%2==0) {
            		col++;
            	}
        }

        System.out.println("Количество четных цифр в сгенерированном числе: "+col);

	}

}
