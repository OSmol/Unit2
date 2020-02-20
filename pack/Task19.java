package my.pack;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Task19 {
	public static void main(String[] args) {
		try {
			PrintStream out = new PrintStream(System.out, true, "UTF-8");
			for(int i=0;i<256;i++) {
				//System.out.println(Character.toString((char)i)+" "+i);
				out.println(Character.toString((char)i)+" "+i);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    
	}
}
