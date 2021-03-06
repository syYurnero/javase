package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains(E e)
 * 判断当前集合是否包含给定元素
 * @author adminitartor
 *
 */
public class Collection_contains {
	public static void main(String[] args) {
		Collection c = new ArrayList();		
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));		
		System.out.println(c);
		
		Point p = new Point(1,2);
//		c.add(p);
		/*
		 * 集合在判断给定元素是否被集合包含时，是
		 * 依靠集合元素equals比较的结果，即:只要
		 * 给定元素与集合现有元素有equals比较为
		 * true的时候，集合就认为包含该元素。
		 */
		boolean contains = c.contains(p);
		System.out.println("是否包含:"+contains);
	}
}











