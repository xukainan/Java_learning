/**  

* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/
package com.uaian.date;

import java.util.Date;

/**  

* <p>Title: DateAndLong</p>  

* <p>Description: Date���Long���͵Ļ���ת��</p>  

* @author kainan  

* @date 2019��3��2��  

*/
public class DateAndLong {
	public static void main(String[] args) {
		/**
		 * ��ϸ�۲�Date���Դ�룬����Date���и��޲εĹ��췽��ʹ��System.currentTimeMillis()
		 * ���и�����long���͵Ĺ��췽��������Ĺ��죨����int��String�����Ѿ�������
		 */
		Date date = new Date();
		long currTimes = System.currentTimeMillis();
		//longת����Date����
		Date date2 = new Date(currTimes);
		System.out.println(date.equals(date2));
		//Date����ת����long����
		long time = date.getTime();
		System.out.println(time == currTimes);

	}
}
