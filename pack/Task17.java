package my.pack;
import java.math.BigDecimal;
import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		int min = 10; 
	    int max = 100; 
	    double a=0.0;
	    double sum=0.0;

	    Scanner sc = new Scanner(System.in);  
	      
	    int n = min + (int) (Math.random() * max);
	    System.out.println("������������� ����������� �����: "+n);
	    System.out.print("������� ����� �������������� �����: ");   
		if (sc.hasNextDouble()) { 
			a=sc.nextDouble();
			}
	    double res = a;
	    double[] sums= new double[n-1];
		//������� ����� � ���������� � ������
	    for(int i=1;i<n;i++) {
		    sum=a+Double.valueOf(i);
	    	sums[i-1]=sum;
	    }
	    
	    for(int i=0;i<sums.length;i++) {
	    	System.out.println("������� ������ ���� "+sums[i]);
	    }
		
        //����������� ��������� �����
        for(int i=0;i<sums.length;i++) {
        		res=res*sums[i];
        }
        System.out.println("��������� ��������� a(a+1)...(a+n-1) ��� �������� a="+a+" � n="+n+" �����: "+BigDecimal.valueOf(res));
	}

}
