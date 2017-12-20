package day08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * 缓冲字符流内置缓冲区，可以提高读写字符效率，
 * 并且缓冲字符流的特点是可以按行读写字符串。
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 
 * java.io.PrintWriter是常用的缓冲字符输出流，
 * 并且还提供了自动行刷新功能。由于创建PrintWriter
 * 时其内部总是嵌套BufferedWriter,所以实际的缓冲
 * 操作是由BufferedWriter实现。
 * 
 * 
 * 
 * @author adminitartor
 *
 */
public class PrintWriter_print {
	public static void main(String[] args) throws IOException {
		/*
		 * PW支持直接对文件操作的构造方法
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 * 
		 * 也可以按照指定的字符集创建PW
		 * PrintWriter(String path,String csn)
		 * PrintWriter(File file,String csn)
		 * 
		 * cns:charset name,字符集名称
		 * 
		 */		
		PrintWriter pw 
			= new PrintWriter("pw.txt","UTF-8");		
		pw.println("夜空中最亮的星,");
		pw.println("能否听清,");
		pw.println("那仰望的人,心底的孤独和叹息");
		
		System.out.println("写出完毕!");
		pw.close();

	}
}








