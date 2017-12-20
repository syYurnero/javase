package day01;
/**
 * int indexOf(String str)
 * 返回给定字符串在当前字符串中的位置，若当前
 * 字符串不含有给定字符串内容时返回值为-1
 * @author adminitartor
 *
 */
public class String_indexOf {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		
		int index = str.indexOf("in");
		System.out.println("index:"+index);
		
		index = str.indexOf("in", 3);
		System.out.println("index:"+index);
		
		index = str.lastIndexOf("in");
		System.out.println("index:"+index);
		
	}
}




