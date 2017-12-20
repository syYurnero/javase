package day07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream
 * ����������
 * ���ڽ�һ���ֽ�(ͨ�����������д�������ת����
 * һ���ֽ�)��ȡ��ת��Ϊ��Ӧ�Ķ���
 * 
 * ���������������д��ʱת��Ϊһ���ֽڵĹ���
 * ��Ϊ:�������л�
 * �����������������ֽڶ�ȡ����ԭ�ض���Ĺ���
 * ��Ϊ:�������л�
 * 
 * @author adminitartor
 *
 */
public class ObjectInputStream_readObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis
			= new FileInputStream("person.obj");
		
		ObjectInputStream ois
			= new ObjectInputStream(fis);
		
		Person p = (Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}
}








