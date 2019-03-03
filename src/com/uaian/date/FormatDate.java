/**  

* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/
package com.uaian.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**  

* <p>Title: FormatDate</p>  

* <p>Description: 日期格式化</p>  

* @author kainan  

* @date 2019年3月2日  

*/
public class FormatDate {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		//SimpleDateFormat类继承DateFormat类，DateFormat类继承Format类 ，两个都是抽象类，这是抽象类的双重继承
		//数据库中日期格式化不区分大小写，但java中区分
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
		String dateStr = simpleDateFormat.format(date);
		System.out.println(dateStr);
		//字符串转换成日期类
		String newYear = "2019-01-01";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = simpleDateFormat2.parse(newYear);
		System.out.println(date2);
		//注意：假如月份给定了超过12的数字，会自动进位
	}
}
