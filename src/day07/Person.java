package day07;

import java.io.Serializable;
import java.util.List;

/**
 * ʹ�ø����ʵ��������Ϊ���������ж������Ķ�д
 * 
 * һ�����ʵ����ϣ������������д����ôҪ�����
 * ����ʵ��Serializable�ӿ�
 * @author adminitartor
 *
 */
public class Person implements Serializable{
	/**
	 * ��һ����ʵ����Serializable�ӿں�Ӧ��
	 * �ڵ�ǰ�������һ������:
	 * ���л��汾�� serialVersionUID
	 * 
	 * ���л��汾������ָ������ô���������ڱ���
	 * ���class�ļ���Ĭ�����һ������ֵ���Ǹ���
	 * ��ǰ��ṹ���ɡ�������һ�����⣬����ǰ���
	 * �ṹ�����˸ı䣬��ô����汾�Żᷢ���仯��
	 * ���Խ�������ָ���汾�š�
	 * 
	 * �汾��Ӱ��������л��Ľ����
	 * ��������������ȡһ�����󲢳��Խ��з����л�
	 * ʱ����ö���İ汾���������������а汾��
	 * �Ƿ�һ�£�һ�������л��ɹ�����һ������
	 * �л�ʧ�ܡ�
	 * �汾��һ�µ�����£����������л��Ķ����뵱ǰ
	 * �����нṹ��һ��ʱ�����ȡ����ģʽ����:�ö���
	 * �����ԣ���������Ȼ�е���ԭ��û�е��򱻺��ԡ�
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * transient�ؼ���
	 * �ùؼ��������������ԣ���ô���ö������
	 * ���л�ʱ��������Ե�ֵ�ᱻ���ԡ��Ӷ��ﵽ
	 * ����"����"��Ч����
	 */
	private transient List<String> otherInfo;
	
	
	public Person(){
		
	}

	public Person(String name, int age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	public String toString() {
		return name+","+age+","+gender+","+otherInfo;
	}
}




