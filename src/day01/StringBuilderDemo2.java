package day01;

public class StringBuilderDemo2 {
	public static void main(String[] args) {
		StringBuilder b = new StringBuilder("a");
		for(int i=0;i<10000000;i++){
			b.append("a");
		}
		System.out.println("Íê³É!");
	}
}
