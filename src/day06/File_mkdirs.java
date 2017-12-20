package day06;

import java.io.File;

/**
 * 创建一个多级目录
 * @author adminitartor
 *
 */
public class File_mkdirs {
	public static void main(String[] args) {
		/*
		 * 在当前目录下创建目录:a/b/c/d/e/f
		 */
		File dir = new File(
			"a"+File.separator+
			"b"+File.separator+
			"c"+File.separator+
			"d"+File.separator+
			"e"+File.separator+"f"
		);
		if(!dir.exists()){
			dir.mkdirs();
			System.out.println("目录已创建!");
		}else{
			System.out.println("该目录已存在!");
		}
	}
}










