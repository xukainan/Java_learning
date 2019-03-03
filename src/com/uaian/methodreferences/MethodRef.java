/**  


* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/  
package com.uaian.methodreferences;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**  

* <p>Title: MethodRef</p>  

* <p>Description: </p>  

* @author kainan  

* @date 2019年3月3日  

*/
public class MethodRef {
	public static void main(String[] args) {
		//引用静态方法
		IMethodRef<Integer, String> iMethodRef = String :: valueOf;
		String resS = iMethodRef.strValueOf(11);
		System.out.println(resS);
		//引用类的普通方法
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		IMethodRef2 iMethodRef2 = simpleDateFormat :: format;
		String dateString = iMethodRef2.formatDate(new Date());
		System.out.println(dateString);
		//引用对象的普通方法
		IMethodRef3 iMethodRef3 = "hello world" :: toUpperCase;
		System.out.println(iMethodRef3.strToUpper());
		//引用类的构造方法
		IMethodRef4<Long, Date> iMethodRef4 = Date :: new ;
		Date date = iMethodRef4.getCurDate(System.currentTimeMillis());
		System.out.println(date);
	}
}
