package my.pack;

public class Task14 {
	public static void main(String[] args) {
		int a,b,c,d,sum;

        for(int i=1000;i<10000;i++) {
        	a = i%10; // четвертая цифра
            b = (i/10)%10; // третья цифра
            c = (i/100)%10; // вторая цифра
            d = i/1000; // первая цифра
            sum = a + b + c + d;
            if (sum == 15) {
            	System.out.println(i);
            	}
        }
	}
}
