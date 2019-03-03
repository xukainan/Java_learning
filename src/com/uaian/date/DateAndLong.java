/**  

* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/
package com.uaian.date;

import java.util.Date;

/**  

* <p>Title: DateAndLong</p>  

* <p>Description: Date类和Long类型的互相转化</p>  

* @author kainan  

* @date 2019年3月2日  

*/
public class DateAndLong {
	public static void main(String[] args) {
		/**
		 * 仔细观察Date类的源码，发现Date类有个无参的构造方法使用System.currentTimeMillis()
		 * 还有个传入long类型的构造方法，其余的构造（包括int、String）都已经被弃用
		 */
		Date date = new Date();
		long currTimes = System.currentTimeMillis();
		//long转化成Date类型
		Date date2 = new Date(currTimes);
		System.out.println(date.equals(date2));
		//Date类型转化成long类型
		long time = date.getTime();
		System.out.println(time == currTimes);

	}
}
