package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 异常在IO操作中的处理方式
 * 
 * 
 * 笔试题:
 * 请简述:final,finally,finalize的作用
 * 
 * @author adminitartor
 *
 */
public class Exception_IO {
	/**
	 * 当一个对象即将被GC释放前，GC会调用该对象
	 * 的finalize方法，调用后该对象即被释放。
	 * finalize方法是Obeject定义的方法。
	 * 
	 */
	protected void finalize() throws Throwable {
		
	}
	
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("fos.txt");
			fos.write("你好".getBytes());		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
			}
		}
		
	}
}






