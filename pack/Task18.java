package my.pack;
import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
		int min = 1; 
	    int max = 10; 
	    double a=0.0;
	    double b=0.0;
	    double res=0.0;
	    int steps_col=0;
	    double x=0.0;
	    int h = min + (int) (Math.random() * max);
	    
	    System.out.println("—генерирован шаг: "+h);
	    System.out.print("¬ведите начальное и конечное значени€ интервала дл€ функции: ");   
		if (sc.hasNextDouble()) { 
			a=sc.nextDouble();
			b=sc.nextDouble();
			}
		
		if(a<h&&b<h) {
			System.out.println("¬веденный интервал меньше сгенерированного шага, функци€ не может быть рассчитана");
		}
		
		//провер€ем введенные границы интервала и высчитываем количество шагов
		if(a<b||a==b) {
			steps_col=(int)((b-a)/h)+1;
			}else if(a>b) {
				steps_col=(int)((a-b)/h)+1;
				double temp=a;
				a=b;
				b=temp;
			}
	
	    double[][] fun= new double[steps_col][2];
	    
		//находим суммы и записываем в массив
	    for(int i=0;i<steps_col;i++) {
	    	if(i==0) {
		    	x=a;
	    	}else if(i>0) {
	    		x=fun[i-1][0]+h;
	    	}
	    	fun[i][0]=x;
	    	res=Math.pow(Math.sin(x), 2);
	    	fun[i][1]=res;
	    }
	    
	    //выводим таблицу с результатом
	    System.out.println("x : result");  
	    for (int i=0; i<steps_col; i++) { 
            for (int j=0; j<2; j++) {
                System.out.print(" " + fun[i][j] + " "); 
            }
            System.out.println();
        }
	}
}

