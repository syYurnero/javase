package day03;

import java.util.Calendar;

/**
 * void add(int field,int value)
 * 对指定的时间分量加给定的值，若给定的值为负数
 * 则是减去。
 * @author adminitartor
 *
 */
public class Calendar_add {
	public static void main(String[] args) {
		/*
		 * 查看3年零2个月的前25天以后那周的周五是哪天?
		 */
		Calendar calendar = Calendar.getInstance();
		//+3年
		calendar.add(Calendar.YEAR, 3);
		//+2月
		calendar.add(Calendar.MONTH, 2);
		//-25天
		calendar.add(Calendar.DAY_OF_YEAR, -25);
		
		calendar.set(Calendar.DAY_OF_WEEK, 6);
		System.out.println(calendar.getTime());
		
	}
}







