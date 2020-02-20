package my.pack;
import java.util.ArrayList;

public class Task16 {
	public static void main(String[] args) {
	    int sum=0;
	    long res=0;
	    ArrayList<Integer> sums= new ArrayList<Integer>();
        
	    //находим суммы и записываем в массив
	    for(int i=2;i<11;i++) {
	    	if(i==2) {
		    	sum=1+i;
	    	}else if(i>2) {
		    	sum=sum+i;
	    	}
	    	sums.add(sum);
	    }
      
        //перемножаем найденные суммы
        for(int i=0;i<sums.size();i++) {
        	if(i==0) {
        		res=sums.get(i);
        	}else if(i>0) {
        		res=res*sums.get(i);
        	}
        }
        System.out.println("Результат выражения (1+2)*(1+2+3)*...*(1+2+...+10) равен: "+res);
	}


}
