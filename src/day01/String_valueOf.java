package day01;
/**
 * static String valueOf(XXX xxx)
 * 字符串提供了一组重载的valueOf方法，可以java中
 * 不同类型的数据转换为字符串
 * 常见的是将基本类型转换为字符串
 * @author adminitartor
 *
 */
public class String_valueOf {
	public static void main(String[] args) {
		int d = 123;
		String str = String.valueOf(d);//"123"
		System.out.println(str+4);
		
		double dou = 123.123;
		String str2 = String.valueOf(dou);
		System.out.println(str2+4);
		
		
		str = 123+"";
	}
}








