/**  


* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/  
package com.uaian.number;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**  

* <p>Title: BigDecTest</p>  

* <p>Description: </p>  

* @author kainan  

* @date 2019Äê3ÔÂ3ÈÕ  

*/
class MathUtil{
	public MathUtil() {}
	
	public static double round(double num, int scale) {
		return new BigDecimal(num).divide(new BigDecimal(1.0), scale, RoundingMode.HALF_UP).doubleValue();
	}
	
}
public class BigDecTest {
	public static void main(String[] args) {
		System.out.println(MathUtil.round(19.67855, 2));
	}
}
