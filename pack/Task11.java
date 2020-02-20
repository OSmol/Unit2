package my.pack;

import java.util.ArrayList;

public class Task11 {
	public static void main(String[] args) {
		int min = 10; 
	    int max = 10000; 
        ArrayList<Integer> numsx = new ArrayList<>();
        ArrayList<Integer> numsy = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
	      
	    int x = min + (int) (Math.random() * max);
	    int y = min + (int) (Math.random() * max);
	    
	    System.out.println("Сгенерированы 2 числа: "+x+" "+y);
        
	    //разбиваем числа на отдельные цифры и записываем в массив
        while (x != 0) {
          numsx.add(x % 10);
          x /= 10;
        }
        while (y != 0) {
            numsy.add(y % 10);
            y /= 10;
          }
        
        //ищем совпадающие цифры
        for(int i=0;i<numsx.size();i++) {
        	for(int j=0;j<numsy.size();j++) {
            	if(numsx.get(i).equals(numsy.get(j))) {
                	res.add(numsx.get(i));
            	}
        	}
        }
        if(res.size()==0) {System.out.print("У сгенерированных чисел нет общих цифр");}
        
        //удаляем дубликаты
        for(int i=0;i<res.size();i++) {
        	for(int j=1;j<res.size();j++) {
        		if(res.get(i).equals(res.get(j))) {
        			res.remove(i);
        		}
        	}
        }
        
        //распечатываем найденные совпадающие цифры
        System.out.println("Цифры, входящие в состав обоих сгенерированных чисел:");
        for(int i=0;i<res.size();i++) {
        	System.out.println(" "+res.get(i)+" ");
        }
	}
}
