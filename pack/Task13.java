package my.pack;

import java.util.ArrayList;

public class Task13 {
	public static void main(String[] args) {
		int min = 10; 
	    int max = 10000; 
	    int max_number=0;
	    ArrayList<Integer> numbers= new ArrayList<Integer>();
	      
	    int x = min + (int) (Math.random() * max);
	    System.out.println("������������� �����: "+x);
        
	    //��������� ����� �� ��������� ����� � ���������� � ������
        while (x != 0) {
        	numbers.add(x % 10);
        	x /= 10;
        }
      
        //���� ���������� �����
        for(int i=0;i<numbers.size();i++) {
            	if(numbers.get(i)>max_number) {
            		max_number=numbers.get(i);
            	}
        }

        System.out.println("���������� ����� � ��������������� �����: "+max_number);

	}
}
