package day02;
/**
 * 
 * @author adminitartor
 *
 */
public class Test2 {
	public static void main(String[] args) {
		String regex = "(wqnmlgb|cnm|nc|tmd|mdzz|mmp|djb|sb)";
		
		String message = "wqnmlgb!你这个sb!你怎么这么nc!tmd!你个djb!";
		
		message = message.replaceAll(regex, "***");
		System.out.println(message);
	}
}
