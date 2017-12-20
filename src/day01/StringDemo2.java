package day01;
/**
 * 频繁修改字符串的性能损耗问题
 * @author adminitartor
 *
 */
public class StringDemo2 {
	public static void main(String[] args) {

		String str = "a";
		for(int i=0;i<10000000;i++){
			str += str;
		}
		System.out.println("完成!");
		
		
	}
}
