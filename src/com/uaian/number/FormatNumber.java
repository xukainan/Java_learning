/**  

* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/
package com.uaian.number;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

/**  

* <p>Title: FormatNumber</p>  

* <p>Description: ����ת�����ʹ��</p>  

* @author kainan  

* @date 2019��3��2��  

*/
public class FormatNumber {
	public static void main(String[] args) throws ParseException {
		double testNum = 5235555.20;
		String numStr = NumberFormat.getInstance().format(testNum);
		System.out.println(numStr);
		
	}
}
