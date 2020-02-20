package my.pack;

import java.util.ArrayList;

public class Task13 {
	public static void main(String[] args) {
		int min = 10; 
	    int max = 10000; 
	    int max_number=0;
	    ArrayList<Integer> numbers= new ArrayList<Integer>();
	      
	    int x = min + (int) (Math.random() * max);
	    System.out.println("Сгенерировано число: "+x);
        
	    //разбиваем число на отдельные цифры и записываем в массив
        while (x != 0) {
        	numbers.add(x % 10);
        	x /= 10;
        }
      
        //ищем наибольшую цифру
        for(int i=0;i<numbers.size();i++) {
            	if(numbers.get(i)>max_number) {
            		max_number=numbers.get(i);
            	}
        }

        System.out.println("Наибольшая цифра в сгенерированном числе: "+max_number);

	}
}
