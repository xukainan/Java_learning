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

* <p>Description: ���ڸ�ʽ��</p>  

* @author kainan  

* @date 2019��3��2��  

*/
public class FormatDate {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		//SimpleDateFormat��̳�DateFormat�࣬DateFormat��̳�Format�� ���������ǳ����࣬���ǳ������˫�ؼ̳�
		//���ݿ������ڸ�ʽ�������ִ�Сд����java������
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
		String dateStr = simpleDateFormat.format(date);
		System.out.println(dateStr);
		//�ַ���ת����������
		String newYear = "2019-01-01";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = simpleDateFormat2.parse(newYear);
		System.out.println(date2);
		//ע�⣺�����·ݸ����˳���12�����֣����Զ���λ
	}
}
