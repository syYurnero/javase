package day08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ×ª»»Á÷
 * java.io.InputStreamReader
 * 
 * @author adminitartor
 *
 */
public class InputStreamReader_read {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("osw.txt");
		
		InputStreamReader isr
			= new InputStreamReader(fis,"UTF-8");
		
//		int d = -1;
//		while((d = isr.read()) != -1){
//			System.out.print((char)d);
//		}
		
		char[] data = new char[100];
		int len = isr.read(data);
		String str = String.valueOf(
			data, 0, len
		);
		System.out.println(str);
		
		isr.close();
	}
}








