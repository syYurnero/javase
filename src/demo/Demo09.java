package demo;

import java.util.ArrayList;

public class Demo09 {
	public static void main(String[] args)
		throws Exception{
		int c = '��';
		//UTF-8��������һ���ֽ�
		//���ַ������6λ������ c & 0x3f 
		//ƴ������ֽڵĸ�ʽ 0x80|c&0x3f
		System.out.println(
				Integer.toBinaryString(c));
		System.out.println(
				Integer.toBinaryString(c&0x3f));
		System.out.println(
				Integer.toBinaryString(
						0x80 |(c & 0x3f)));
		
		int b3 = 0x80|c&0x3f;
		int b2 = 0x80|(c>>>6) & 0x3f;
		int b1 = 0xe0|(c>>>12) & 0xf;
		
		//����java���ַ�����API��֤�������ȷ��
		byte[] bytes = 
			{(byte)b1, (byte)b2, (byte)b3,
			(byte)b1, (byte)b2, (byte)b3};
		//��bytes����utf-8�������Ϊ�ַ���
		String s=new String(bytes, "utf-8");
		System.out.println(s); //��
		
		int cc =((b1 & 0xf)<<12) | 
				((b2 & 0x3f)<<6) | 
				(b3 & 0x3f);
		char ch = (char)cc;
		System.out.println(ch); 
		
		//ArrayList  list = new ArrayList();
		//list.add(e)
	}
	

}








