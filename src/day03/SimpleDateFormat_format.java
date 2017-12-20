package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 可以将Date与String之间按照指定的日期格式互相
 * 转换。
 * @author adminitartor
 *
 */
public class SimpleDateFormat_format {
	public static void main(String[] args) {
		Date now = new Date();		
		System.out.println(now);
		/*
		 * 2017-08-23 10:23:35
		 * yyyy-MM-dd HH:mm:ss
		 */
		SimpleDateFormat sdf
			= new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss E a"
			);
		
		String str = sdf.format(now);
		System.out.println(str);
		
	}
}









