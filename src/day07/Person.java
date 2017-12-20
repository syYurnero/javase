package day07;

import java.io.Serializable;
import java.util.List;

/**
 * 使用该类的实例测试作为对象来进行对象流的读写
 * 
 * 一个类的实例若希望被对象流读写，那么要求该类
 * 必须实现Serializable接口
 * @author adminitartor
 *
 */
public class Person implements Serializable{
	/**
	 * 当一个类实现了Serializable接口后，应当
	 * 在当前类中添加一个常量:
	 * 序列化版本号 serialVersionUID
	 * 
	 * 序列化版本号若不指定，那么编译器会在编译
	 * 后的class文件中默认添加一个，而值则是根据
	 * 当前类结构生成。但这有一个问题，若当前类的
	 * 结构发生了改变，那么这个版本号会发生变化。
	 * 所以建议自行指定版本号。
	 * 
	 * 版本号影响对象反序列化的结果：
	 * 当对象输入流读取一个对象并尝试进行反序列化
	 * 时会检查该对象的版本号与其所属类现有版本号
	 * 是否一致，一致则反序列化成功，不一致则反序
	 * 列化失败。
	 * 版本号一致的情况下，若待反序列化的对象与当前
	 * 类现有结构不一致时，则采取兼容模式，即:该对象
	 * 的属性，现有类依然有的则还原，没有的则被忽略。
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * transient关键字
	 * 该关键字用来修饰属性，那么当该对象进行
	 * 序列化时，这个属性的值会被忽略。从而达到
	 * 对象"瘦身"的效果。
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




